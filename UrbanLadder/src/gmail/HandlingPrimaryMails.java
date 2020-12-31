package gmail;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class HandlingPrimaryMails {
	@Test
	public static void primaryMails() throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.gmail.com/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.id("identifierId")).sendKeys("divyashree.raj93");
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("rajarathna");
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement wb=driver.findElement(By.xpath("//div[@aria-label='Primary']"));
		String status=wb.getAttribute("aria-selected");
		if(status.equals("false"))
			wb.click();
		List<WebElement> mailList=driver.findElements(By.xpath("//div[@class='UI']/child::div[@class='aDP']/child::div[@id=':2e']/descendant::div[@class='Cp']/descendant::table/child::tbody/child::tr"));
		//System.out.println("number of mails: "+driver.findElement(By.xpath("//div[@id=':ey']/child::span[@class='Dj']/child::span[@class='ts']")).getText());
		System.out.println(mailList.size());
		int n=5;
		String senderName=driver.findElement(By.xpath("//div[@class='UI']/div[@class='aDP']/child::div[@id=':2e']/descendant::div[@class='Cp']/descendant::table/tbody/tr["+n+"]/td[5]/div[@class='yW']/span/span")).getText();
		System.out.println("sendername= "+senderName);
		String msg=driver.findElement(By.xpath("//div[@class='UI']/div[@class='aDP']/child::div[@id=':2e']/descendant::div[@class='Cp']/descendant::table/tbody/tr["+n+"]/td[6]/descendant::span[@class='bog']/span")).getText();
		System.out.println("msg= "+msg);
		driver.close();
	}
	

}
