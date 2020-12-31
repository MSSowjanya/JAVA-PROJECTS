package assignment1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;


public class GetMenu{
	
	@Test
	public void getMenu() {
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
			
			List<WebElement> submenu=driver.findElements(By.xpath("//ul[@class='topnav bodytext']/li["+(i+1)+"]/descendant::li[@class='sublist_item']/div/a"));
			Thread.sleep(2000);
			for(int j=0; j<submenu.size();j++) {
				WebElement wb2=submenu.get(j);
				System.out.println("	"+wb2.getText());
			}
			
		
		}
		driver.close();
				
			
		}
		
		/**
		 * List<WebElement> ssmenu=driver.findElements(By.xpath("//ul[@class='topnav bodytext']/li"+(j+1)+"/descendant::li[@class='sublist_item']/descendant::div/a[text()='"+submenu.get(j)+"']/../following-sibling::ul/li/a"));
				Thread.sleep(2000);
				for(int k=0; k<ssmenu.size(); k++) {
					WebElement wb3=ssmenu.get(k);
					System.out.println(wb3.getText());
				}
		 */
	}
	


}
