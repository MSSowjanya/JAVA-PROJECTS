package synchronization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitExp {

	public static void main(String[] args) {
		System.setProperty("WebDriver.chrome.driver", "./chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Divyashree/Desktop/delayedTextBox.html");
		WebElement txtbox=driver.findElement(By.id("iamtextbox"));
		WebDriverWait wait=new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(txtbox));
		txtbox.sendKeys("TestYantra");
		driver.close();
	}

}
