package amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class GetPriceList {
	@Test
	public void getList() throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.amazon.in/");
		WebElement searchBox=driver.findElement(By.id("twotabsearchtextbox"));
		searchBox.sendKeys("Pen Drives");
		Actions act=new Actions(driver);
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(3000);
		//driver.findElement(By.xpath("//span[@class='a-dropdown-container']")).click();
		//driver.findElement(By.xpath("//li/a[text()='Price: Low to High']")).click();
	}
	
	
	
	

}
