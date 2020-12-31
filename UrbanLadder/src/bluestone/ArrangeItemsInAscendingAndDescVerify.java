package bluestone;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ArrangeItemsInAscendingAndDescVerify {

	@Test
	public void orderElements() throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.bluestone.com/");
		Thread.sleep(4000);
	
		Actions act =new Actions(driver);
		WebElement wb=driver.findElement(By.xpath("//div[@class='bottom-header']/child::div[@class='container']/descendant::ul[@class='wh-main-menu']/descendant::a[text()='Earrings ']"));
		act.moveToElement(wb).perform();
		driver.findElement(By.xpath("//a[text()='Gold Earrings']")).click();
		Thread.sleep(2000);
		WebElement sortBy=driver.findElement(By.xpath("//div[@class='pull-right sort-options']/descendant::section[@class='block sort-by pull-right']"));
		Thread.sleep(2000);
		act.moveToElement(sortBy).perform();
		Thread.sleep(2000);
		List<WebElement> priceEle1=driver.findElements(By.xpath("//div[@id='grid-view-result']/child::ul/child::li/descendant::div[@class='inner pd-gray-bg']/descendant::span[@class='p-wrap']/descendant::span[@class='new-price']"));
		List<String> prList1=new ArrayList<>();
		for(WebElement wb1:priceEle1) {
			prList1.add(wb1.getText());
		}
		
		
		driver.findElement(By.xpath("//div[@id='view-sort-by']/child::div/child::a[text()='Price Low to High ']")).click();
		List<WebElement> priceEle=driver.findElements(By.xpath("//div[@id='grid-view-result']/child::ul/child::li/descendant::div[@class='inner pd-gray-bg']/descendant::span[@class='p-wrap']/descendant::span[@class='new-price']"));
		List<String> prList=new ArrayList<>();
		for(WebElement wb1:priceEle) {
			prList.add(wb1.getText());
		}
		System.out.println(prList1);
		System.out.println(prList);
		Collections.sort(prList1);
		System.out.println(prList1);
		
		SoftAssert s=new SoftAssert();
		s.assertEquals(prList, prList1);
		driver.close();
		
		
	}

}
