package clearTrip;

import org.testng.annotations.Test;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class BookATicketTest {
	@Test
	public void book() throws InterruptedException {
		WebDriver driver= new FirefoxDriver();
		driver.get("https://www.cleartrip.com/");
		
		
		driver.findElement(By.id("RoundTrip")).click();
		WebElement from=driver.findElement(By.id("FromTag"));
		WebElement to=driver.findElement(By.id("ToTag"));
		
		from.clear();
		from.sendKeys("Bangalore");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Bangalore, IN - Kempegowda International Airport (BLR)']")).click();
		
		to.clear();
		to.sendKeys("Mumbai");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Mumbai, IN - Chatrapati Shivaji Airport (BOM)']")).click();
		
		LocalDate todayDate = LocalDate.now();
		LocalDate Departure =todayDate.plusDays(50);
		
		int todayMonth=todayDate.getMonthValue();
		int departMonth=Departure.getMonthValue();
		int clickNext=departMonth-todayMonth;
		int departDate=Departure.getDayOfMonth();
		
		LocalDate returnPlan=Departure.plusDays(20);
		int returnMonth=returnPlan.getMonthValue();
		int clickNextRet=returnMonth-departMonth;
		int returnDate=returnPlan.getDayOfMonth();
		
		int Depdate=Departure.getDayOfMonth();
		int DepMon=Departure.getMonthValue();
		//To select Departure date
		driver.findElement(By.id("DepartDate")).click();
		
		for(int i=1; i<=clickNext;i++) {
			driver.findElement(By.xpath("//div[@class='header']/a[@title='Next']")).click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		}
		
		driver.findElement(By.xpath("//div[@id='ui-datepicker-div']/div[@class='monthBlock first']/table/tbody/tr/td[@data-month='5' and @data-year='2019']/a[text()='"+departDate+"']")).click();
		
		//To select return date
		driver.findElement(By.id("ReturnDate")).click();
		
		for(int i=1;i<=clickNextRet;i++) {
			driver.findElement(By.xpath("//div[@class='header']/a[@title='Next']")).click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		}
		driver.findElement(By.xpath("//div[@id='ui-datepicker-div']/div[@class='monthBlock first']/table/tbody/tr/td[@data-month='"+(returnMonth-1)+"' and @data-year='2019']/a[text()='"+returnDate+"']")).click();
	
		WebElement wb=driver.findElement(By.id("Adults"));
		Select sel=new Select(wb);
		sel.selectByValue("2");
		
		driver.findElement(By.id("SearchBtn")).click();
	}
}
