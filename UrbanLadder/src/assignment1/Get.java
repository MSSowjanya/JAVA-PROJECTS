package assignment1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Get {
	@Test
	public void getMenu() throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.urbanladder.com/");
		
		HomePage hp=PageFactory.initElements(driver, HomePage.class);
		
		hp.getCloseBtn().click();
		List<WebElement> menu = driver.findElements(By.xpath("//ul[@class='topnav bodytext']/li"));
		for(WebElement wb: menu) {
			System.out.println(wb.getText());
		}
	}

}
