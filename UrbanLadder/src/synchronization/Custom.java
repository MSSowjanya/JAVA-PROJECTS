package synchronization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Custom {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/Divyashree/Desktop/delayedTextBox.html");
		WebElement ele=driver.findElement(By.id("iamtextbox"));
		new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOf(ele));
		ele.sendKeys("TYSS");

	}

}
