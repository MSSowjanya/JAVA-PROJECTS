package irctc;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TicketBooking{
	@Test
	public void book() throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.irctc.co.in/");
		Thread.sleep(3000);
		//driver.findElement(By.xpath("//div[@class='form-group form-swap col-lg-12 col-md-12 col-sm-12 ui-float-label']/child::p-autocomplete[@id='origin']/descendant::input")).sendKeys("Bangalore");
		WebElement from=driver.findElement(By.xpath("//input[@placeholder='From*']"));
		from.sendKeys("Bangalore");
		Actions act=new Actions(driver);
		act.sendKeys(Keys.ENTER);
	}
}