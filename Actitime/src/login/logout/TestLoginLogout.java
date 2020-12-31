package login.logout;

import java.io.ObjectInputStream.GetField;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestLoginLogout {
	public static void main(String[] args) throws InterruptedException {
		FirefoxDriver driver= new FirefoxDriver();
		driver.get("http://localhost/login.do");

		String expPage="actiTIME - Login";
		String page=driver.getTitle();
		if(expPage.equals(page))
			System.out.println("Home page verification is pass");
		else
			System.out.println("Home page verification is fail");
		
		// Login code
		driver.findElementById("username").sendKeys("admin");
		driver.findElementByName("pwd").sendKeys("manager");
		driver.findElementById("loginButton").click();
		
		Thread.sleep(2000);
		
		String expPage1="actiTIME - Enter Time-Track";
		String page1=driver.getTitle();
		if(expPage1.equals(page1))
			System.out.println("Login page verification is pass");
		else
			System.out.println("Home page verification is fail");
		//Logut code

		driver.findElementById("logoutLink").click();
		driver.close();
	}
}
