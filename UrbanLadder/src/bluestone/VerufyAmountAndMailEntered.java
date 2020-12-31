package bluestone;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class VerufyAmountAndMailEntered {
	@Test
	public void verify() throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.bluestone.com/");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//li[@class='menuparent repb nav-goldmine-link']")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.id("amount")).sendKeys("10000");
		driver.findElement(By.id("Email")).sendKeys("divya@gmail.com");
		driver.findElement(By.xpath("//input[@id='tahLpSubmit']")).click();
		String emailid=driver.findElement(By.id("email")).getAttribute("value");
		String amount=driver.findElement(By.name("subscriptionAmount")).getText();
		SoftAssert s=new SoftAssert();
		s.assertEquals(emailid, "divya.gmail.com");
		s.assertEquals(amount, "Rs 10,000");
		System.out.println(emailid);
		System.out.println(amount);
		driver.close();
	}

}
