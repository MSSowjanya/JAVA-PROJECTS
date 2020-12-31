package com.vTiger.genericlib;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.vTiger.objectRepositoryLib.HomePage;
import com.vTiger.objectRepositoryLib.Login;

public class BaseClass {
	public static WebDriver driver;
	public static FileLib fLib=new FileLib();
	
	@BeforeClass
	public void configBC() throws Throwable {
		String browserName=fLib.getPropertyKeyValue("browser");
		if(browserName.equals("firefox"))
			driver=new FirefoxDriver();
		else if(browserName.equals("chrome"))
			driver=new ChromeDriver();
		else if(browserName.equals("ie"))
			driver=new InternetExplorerDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	@BeforeMethod
	public void configBM() throws Throwable {
		String URL=fLib.getPropertyKeyValue("url");
		String USER=fLib.getPropertyKeyValue("username");
		String PASSWORD=fLib.getPropertyKeyValue("password");
		driver.get(URL);
		Login lp=PageFactory.initElements(driver, Login.class);
		lp.loginToApp(USER, PASSWORD);
		Thread.sleep(2000);
	}
	@AfterMethod
	public void configAM() throws InterruptedException {
		Thread.sleep(2000);
		HomePage hp=PageFactory.initElements(driver, HomePage.class);
		hp.logoutFromApp();
	}
	@AfterClass
	public void configAC() {
		driver.close();
	}
}
