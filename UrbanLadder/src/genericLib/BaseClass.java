package genericLib;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class BaseClass {
	public static WebDriver driver;
	public FileLib flib=new FileLib();
	
	/**
	 * 
	 */

	@BeforeClass
	public void configBC() {
		System.out.println("Launch Browser");
		driver= new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);	
	}
	
	/**
	 * 
	 */
	@AfterClass
	public void configAC() {
		driver.close();
	}
}
