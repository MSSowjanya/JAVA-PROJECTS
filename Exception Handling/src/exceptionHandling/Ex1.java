package exceptionHandling;



import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Ex1 {
	@Test
	public static void test() {
//		WebDriver driver=new FirefoxDriver();
//		driver.get("https://www.facebook.com/");
		try {
//			driver.findElement(By.id("email1")).sendKeys("Divya");;
			int res=50/0;
		}
		catch(ArithmeticException e){
			System.out.println("Cannot be divisible by 0");
			System.out.println(e);
//			e.printStackTrace();
		}
		catch(Exception e) {
			System.out.println("Exception Occured");
		}
		finally {
//			driver.close();
			System.out.println("Finally Block");
		}
	}
}
