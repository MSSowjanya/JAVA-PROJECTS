package ass0705;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class FaceBook {
		@Test
		public void Test() throws InterruptedException{
		FirefoxOptions options = new FirefoxOptions();
		options.setProfile(new FirefoxProfile());
		options.addPreference("dom.webnotifications.enabled", false);
		WebDriver driver=new FirefoxDriver(options);
		
		driver.get("https://www.facebook.com/login/");
		driver.findElement(By.id("email")).sendKeys("divyasri.govindraj@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("SathyaShree@31");
		driver.findElement(By.id("loginbutton")).click();
		
		SoftAssert as=new SoftAssert();
		as.assertEquals(driver.getTitle(), "Facebook");
		
		driver.findElement(By.xpath("//div[@id='userNavigationLabel']")).click();
		Thread.sleep(4000);
		WebDriverWait wait=new WebDriverWait(driver, 20);
		WebElement wb=driver.findElement(By.xpath("//span[contains(text(),'Log Out')]"));
		wait.until(ExpectedConditions.visibilityOf(wb));
		driver.findElement(By.xpath("//span[contains(text(),'Log Out')]")).click();
		as.assertEquals(driver.getTitle(), "Facebook-log in or sign up");
		driver.close();
	}

}
