package extentrep;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class Extent1 {
	@Test
	public void run() {
		System.setProperty("webdriver.driver.chromedriver","C:\\Softwares\\Qspiders\\chromedriver_win32");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.seleniumhq.org/");
		
		//Get syestem date
		
		
		//Create an object of ExtentHtmlReporter
		ExtentHtmlReporter reporter=new ExtentHtmlReporter("./Advancedreports/)
	}
}
