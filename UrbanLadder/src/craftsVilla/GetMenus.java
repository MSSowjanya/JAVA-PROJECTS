package craftsVilla;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class GetMenus {
	@Test
	public void get() throws Throwable {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.craftsvilla.com/");
		List<WebElement> list=driver.findElements(By.xpath("//div[@class='container']/child::ul/child::li/child::a"));
		for(WebElement wb:list) {
			System.out.println(wb.getText());
			
			Actions act=new Actions(driver);
			Thread.sleep(2000);
			act.moveToElement(wb).perform();
			
			Thread.sleep(3000);
			List<WebElement> subListMenu=driver.findElements(By.xpath("//div[@class='container']/child::ul/child::li/child::a[contains(text(),'"+wb.getText()+"')]/parent::li/child::div/descendant::div[@class='container-fluid sub-menu-wrapper']/child::ul/child::li/child::a"));
			Thread.sleep(2000);
			for(WebElement wb1:subListMenu) {
				System.out.println("	"+wb1.getText());
				 
				List<WebElement> ssMenu=driver.findElements(By.xpath("//div[@class='container']/child::ul/child::li/child::a[contains(text(),'"+wb.getText()+"')]/parent::li/child::div/descendant::div[@class='container-fluid sub-menu-wrapper']/child::ul/child::li/child::a[contains(text(),'"+wb1.getText()+"')]/parent::li/child::ul/child::li/child::a"));
				for(WebElement wb2:ssMenu) {
					System.out.println("		"+wb2.getText());
				}
			}
		}	
	}
}
