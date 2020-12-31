package synchronization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExpWait2 {

	public static void main(String[] args) {
		System.setProperty("WebDriver.chrome.driver", "./chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Divyashree/Desktop/DoubleTextBoxes.html");
		
		WebElement txtBox=driver.findElement(By.id("1"));
//		txtBox.sendKeys("ty");

		WebDriverWait wait=new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.textToBePresentInElementValue(txtBox, "TY"));
		
		WebElement txtBox2=driver.findElement(By.id("2"));
		txtBox2.sendKeys("Test Yantra");
		
		driver.close();

	}

}
