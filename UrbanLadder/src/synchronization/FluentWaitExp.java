package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class FluentWaitExp {

	public static void main(String[] args) {
		System.setProperty("WebDriver.chrome.driver", "./chromedriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/Divyashree/Desktop/delayedTextBox.html");
		FluentWait<WebDriver> fwait=new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(10))
				.pollingEvery(Duration.ofSeconds(10))
				.ignoring(NoSuchElementException.class);
		fwait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("iamtextbox")))).sendKeys("TYSS");;

	}

}
