package yatra;

import java.awt.RenderingHints.Key;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TryToBookAndVerifyNoFlightsMsg {
	@Test
	public void verify() throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.yatra.com/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement from=driver.findElement(By.id("BE_flight_origin_city"));
		from.sendKeys("Bangalore");
		Thread.sleep(2000);
		Actions act=new Actions(driver);
		act.sendKeys(Keys.ENTER).perform();
		driver.findElement(By.id("BE_flight_arrival_city")).sendKeys("Shimla");
		Thread.sleep(2000);
		act.sendKeys(Keys.ENTER).perform();
	}
	
}
