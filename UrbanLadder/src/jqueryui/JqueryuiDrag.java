package jqueryui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class JqueryuiDrag {
	@Test
	public static void drag() throws Throwable{
		WebDriver driver=new ChromeDriver();
		driver.get("http://jqueryui.com/droppable/");
		Thread.sleep(2000);
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
		WebElement wb=driver.findElement(By.id("draggable"));
		WebElement wb1=driver.findElement(By.id("droppable"));
		
		Actions act=new Actions(driver);
		act.dragAndDrop(wb, wb1).perform();
		
		String actualText=wb1.getText();
		String expectedText="Dropped!";
		
		SoftAssert s=new SoftAssert();
		
		s.assertEquals(actualText, expectedText);
		
		driver.close();
	}

}
