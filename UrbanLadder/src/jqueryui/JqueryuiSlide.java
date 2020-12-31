package jqueryui;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class JqueryuiSlide {
	@Test
	public static void scroll() throws Throwable{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://jqueryui.com/slider/");
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
				
		WebElement wb=driver.findElement(By.xpath("//div[@id='slider']"));
		Actions act=new Actions(driver);
		//act.clickAndHold().perform();
		//((JavascriptExecutor)driver).executeScript("scroll(0,400)", wb);
		//int noOfPixels=2000;
		for(int j=0; j<=250; j+=20) {
				act.moveToElement(wb).clickAndHold().moveByOffset(j, 0).release().perform();
				Thread.sleep(1000);
				
		}
		
		
		driver.close();
	}
}
