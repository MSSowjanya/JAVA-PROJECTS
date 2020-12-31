package assignment1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;


public class GetMenu1{
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
			
			List<WebElement> submenu=driver.findElements(By.xpath("//ul[@class='topnav bodytext']/li/span[contains(text(),'"+wb1.getText()+"')]/following-sibling::div/div/ul/li/div/a"));
			Thread.sleep(2000);
			for(int j=0; j<submenu.size();j++) {
				WebElement wb2=submenu.get(j);
				System.out.println("	"+wb2.getText());
				List<WebElement> ssmenu=driver.findElements(By.xpath("//ul[@class='topnav bodytext']/li/span[contains(text(),'Living')]/following-sibling::div/div/ul/li/div/a[text()='"+wb2.getText()+"']/../../ul/li/a"));
				Thread.sleep(2000);
				for(int k=0;k<ssmenu.size();k++) {
					WebElement wb3=ssmenu.get(k);
					System.out.println(wb3.getText());
				}
				
			}
			
		
		}
		driver.close();
	}
}
