package com.vTiger.testscripts;



import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.vTiger.genericLib.BaseClass;

public class ProductsTest extends BaseClass{
	@Test
	public void createProduct() throws Throwable {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.linkText("Products")).click();
		driver.findElement(By.xpath("//img[contains(@title,'Create Product')]")).click();

		driver.findElement(By.name("productname")).sendKeys(flib.getExcelData("Sheet1", 1, 2));
		driver.findElement(By.name("discontinued")).click();
		driver.findElement(By.name("productcode")).sendKeys(flib.getExcelData("Sheet1", 1, 3));
		driver.findElement(By.id("jscal_field_sales_start_date")).sendKeys(flib.getExcelData("Sheet1", 1, 4));
		/**
		 * 
		 */
		WebElement manufact = driver.findElement(By.xpath("//select[@name='manufacturer']"));
		manufact.click();
		Select sel=new Select(manufact);
		sel.selectByValue(flib.getExcelData("Sheet1", 1, 5));
		
		WebElement productcat = driver.findElement(By.name("productcategory"));
		productcat.click();
		Select sel1=new Select(productcat);
		sel1.selectByValue(flib.getExcelData("Sheet1", 1, 6));
		
		driver.findElement(By.id("unit_price")).clear();
		Thread.sleep(3000);
		driver.findElement(By.id("unit_price")).sendKeys(flib.getExcelData("Sheet1", 1, 7));
		
		Thread.sleep(3000);
		driver.findElement(By.id("tax1_check")).click();
		WebElement wb=driver.findElement(By.id("tax1"));
		wb.clear();
		driver.findElement(By.id("tax1")).sendKeys("12.9");
		
		Thread.sleep(3000);
		driver.findElement(By.name("button")).click();
		
	}
	
	@Test
	public void searchProduct() {
		
	}
}
	
	


