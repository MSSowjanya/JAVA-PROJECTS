package CustomerHandling;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CreateCustomer {

	public static void main(String[] args) throws InterruptedException {
		// Data declaration
		String url="http://localhost/login.do";
		String userID="admin";
		String pwd1="manager";
		String expmsg="has been successfully created.";
		
		// Step 1: Navigate to app
		FirefoxDriver driver=new FirefoxDriver();
		driver.get(url);

		//step 2: login to the app
		driver.findElementById("username").sendKeys(userID);
		driver.findElementByName("pwd").sendKeys(pwd1);
		driver.findElementById("loginButton").click();
		Thread.sleep(3000);
		
		//step 3: Navigate to tasks image
		driver.findElementByXPath("//div[text()='TASKS']/..").click();
		Thread.sleep(1000);
		
		//step 4: Navigate to "Project and customers page"
		driver.findElementByXPath("//a[@href='/project/customers_projects.do']").click();
		Thread.sleep(1000);
		
		//step 5: Navigate to "create new customer"
		driver.findElementById("ext-comp-1002").click();
		Thread.sleep(1000);
		
		//step 6: create a customer
		driver.findElementById("customerLightBox_nameField").sendKeys("ICICI4");
		driver.findElementById("customerLightBox_commitBtn").click();
		Thread.sleep(5000);
		
		//verification of success msg
		 WebElement wb = driver.findElementByXPath("//span[@class='successmsg']");
		 String actmsg = wb.getText();
		 
		 if(actmsg.contains(expmsg))
			 System.out.println("msg is verified ==> PASS");
		 else
			 System.out.println("msg is verified ==> FAIL");
		 
		 //verify color of success msg
		 String color=wb.getCssValue("color");
		 System.out.println("color ==> " + color);
		 
		 //
		 Dimension dem=wb.getSize();
		 System.out.println("---get the size-----");
		 System.out.println(dem.getHeight());
		 System.out.println(dem.getWidth());
		 
		 //get location
		 Point p= wb.getLocation();
		 System.out.println("---get location----");
		 System.out.println(p.getX());
		 System.out.println(p.getY());
		 
		 //Logout
		 driver.findElementById("logoutLink").click();
		
		 driver.close();
		
	}

}
