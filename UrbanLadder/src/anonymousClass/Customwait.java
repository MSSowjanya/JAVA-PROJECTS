package anonymousClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Customwait {
	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/Divyashree/Desktop/DoubleTextBoxes.html");
		WebElement ele=driver.findElement(By.id("2"));
		(new WebDriverWait(driver,10))
		.until(new ExpectedCondition<Boolean>() {
			@Override
			public Boolean apply(WebDriver d) {
				String str=d.findElement(By.id("1")).getAttribute("value");
//				if(str.equalsIgnoreCase("TYSS")) {
//					return true;
//				}
//				else{
//					return false;
//				}
				return (str.equalsIgnoreCase("TYSS"))?true:false;
			}
		});
		ele.sendKeys("Test Yantra");
		
	}
}
