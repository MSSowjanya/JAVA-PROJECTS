package ass0705;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class NewTabHandling {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		//Actions act=new Actions(driver);
		//act.sendKeys(Keys.chord(Keys.CONTROL,"t")).perform();;
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.open()");
		
		Set<String> tab_handles = driver.getWindowHandles();
		ArrayList<String> al=new ArrayList<>(tab_handles);
		driver.switchTo().window(al.get(1));
		driver.get("https://www.google.com/");
		driver.switchTo().window(al.get(0));
		driver.get("https://www.facebook.com/");
		driver.close();
	}
}
