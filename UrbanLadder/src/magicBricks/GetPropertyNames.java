package magicBricks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class GetPropertyNames {
	@Test
	public void get() throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.magicbricks.com/");
		
		driver.findElement(By.id("keyword")).sendKeys("Banalore South");
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//div[@id='keyword_suggest']/div[2]")).click();
		
		driver.findElement(By.xpath("//div[@id='buy_propertyType']")).click();
		driver.findElement(By.xpath("//span[@id='propType_buy_span_10002_10003_10021_10022']")).click();
		
		driver.findElement(By.id("buy_budget_lbl")).click();
		
	}

}
