package com.vTiger.testscripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.vTiger.genericLib.BaseClass;
import com.vTiger.genericLib.WebDriverCommonLib;

public class ProductsTestScripts extends BaseClass{
	WebDriverCommonLib wLib = new WebDriverCommonLib();
	@Test
	public void createProduct() throws Throwable {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.linkText("Products")).click();
		driver.findElement(By.xpath("//img[contains(@title,'Create Product')]")).click();
		
		driver.findElement(By.name("productname")).sendKeys(flib.getExcelData("Sheet1", 1, 2));
		driver.findElement(By.name("button")).click();
		
		Thread.sleep(3000);
		String productName=(driver.findElement(By.id("mouseArea_Product Name")).getText().trim());
		if(productName.equals(flib.getExcelData("Sheet1", 1, 2))) {
			System.out.println("Product is saved successfully");
		}
	}
	@Test
	public void searchForActiveProducts() throws Throwable {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		wLib.waitAndClick(driver.findElement(By.linkText("Products")));
		
		
		driver.findElement(By.linkText("Create Filter")).click();
		driver.findElement(By.name("viewName")).clear();
		driver.findElement(By.name("viewName")).sendKeys(flib.getExcelData("Sheet2", 1, 2));
		
		WebElement wb1=driver.findElement(By.name("column3"));
		wb1.click();
		Select sel=new Select(wb1);
		sel.selectByVisibleText(flib.getExcelData("Sheet2", 1, 3));
		
		driver.findElement(By.id("mi")).click();
		
		WebElement wb2=driver.findElement(By.id("fcol0"));
		wb2.click();
		Select sel2=new Select(wb2);
		sel2.selectByVisibleText(flib.getExcelData("Sheet2", 1, 4));
		
		WebElement wb3=driver.findElement(By.id("fop0"));
		wb3.click();
		Select sel3=new Select(wb3);
		sel3.selectByVisibleText(flib.getExcelData("Sheet2", 1, 5));
		
		driver.findElement(By.id("fval0")).sendKeys(flib.getExcelData("Sheet2", 1, 6));
		
		driver.findElement(By.name("button2")).click();
		
		WebElement wb4=driver.findElement(By.id("viewname"));

		Select sel4=new Select(wb4);
		sel4.selectByVisibleText("ActiveProducts");
		
		String ActiveStatus=driver.findElement(By.xpath("//tr[@id='row_78']/td[4]")).getText();
		if(ActiveStatus.equals(flib.getExcelData("Sheet2", 1, 6))) {
			System.out.println("products in active condition only got displayed");
		}
	}
	@Test
	public void editProduct() throws Throwable {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.linkText("Products")).click();
		
		driver.findElement(By.xpath("//a[@href='index.php?module=Products&parenttab=Inventory&action=DetailView&record=78']")).click();
		
		driver.findElement(By.xpath("//td[@class='dvtTabCacheBottom']/input[@name='Edit']")).click();
		
		WebElement manufact = driver.findElement(By.xpath("//select[@name='manufacturer']"));
		manufact.click();
		Select sel5=new Select(manufact);
		sel5.selectByValue(flib.getExcelData("Sheet1", 1, 5));
		
		driver.findElement(By.name("button")).click();
		
		
	}
}
