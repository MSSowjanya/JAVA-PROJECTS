package assignment1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class MenuList {
	@Test
	public void getMenu() throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.urbanladder.com/");
		
		HomePage hp=PageFactory.initElements(driver, HomePage.class);
		
		hp.getCloseBtn().click();
		
		List<WebElement> menu = driver.findElements(By.xpath("//span[@class='topnav_itemname']"));
		for(int i=0; i<menu.size(); i++) {
			WebElement wb1=menu.get(i);
			System.out.println(wb1.getText());
			
			Actions act=new Actions(driver);
			Thread.sleep(2000);
			act.moveToElement(wb1).perform();
			
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			List<WebElement> subMenu=driver.findElements(By.xpath("//div/ul[@class='topnav bodytext']/child::li/child::span[contains(.,'"+wb1.getText()+"')]/parent::li/descendant::li[@class='sublist_item']/child::div/child::a"));
			Thread.sleep(2000);
			for(int j=0;j<subMenu.size();j++) {
				WebElement wb2=subMenu.get(j);
				System.out.println("	"+wb2.getText());
			
				List<WebElement> ssMenu=driver.findElements(By.xpath("//div[@id='topnav_wrapper']/ul[@class='topnav bodytext']/child::li/child::span[contains(.,'"+wb1.getText()+"')]/parent::li/descendant::li[@class='sublist_item']/child::div/child::a[text()='"+wb2.getText()+"']/parent::div/following-sibling::ul/descendant::span"));
				Thread.sleep(2000);
				for(int k=0; k<ssMenu.size();k++) {
					WebElement wb3=ssMenu.get(k);
					System.out.println("             "+wb3.getText());
				}
			}
		}
	driver.close();
	}
}
