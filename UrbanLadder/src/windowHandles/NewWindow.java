package windowHandles;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class NewWindow {
	@Test
	public void open() {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.google.com");
		
		
//		act.sendKeys(Keys.CONTROL+"T").perform();
		
//		driver.findElement(By.id("body")).click();
//		act.sendKeys(Keys.chord(Keys.CONTROL ,"T")).build().perform();
		
		/**WebElement link=driver.findElement(By.linkText("Gmail"));
		Actions act=new Actions(driver);
		act.contextClick(link).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
		act.contextClick(link).keyDown(Keys.COMMAND).build().perform();
		act.sendKeys(Keys.ENTER).build().perform();**/
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.open()");
		
//		act
//		.keyDown(Keys.COMMAND)
//		.click(link)
//		.keyUp(Keys.COMMAND)
//		.build()
//		.perform();
		
	}

}
