package com.vTiger.testscripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.vTiger.genericLib.BaseClass;

public class SearchForProductWithProductActive extends BaseClass{
	@Test
	public void searchForActiveProducts() throws Throwable {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.linkText("Products")).click();
		
		driver.findElement(By.linkText("Create Filter")).click();
		driver.findElement(By.name("viewName")).clear();
		driver.findElement(By.name("viewName")).sendKeys(flib.getExcelData("Sheet2", 1, 2));
		
		WebElement wb1=driver.findElement(By.name("column3"));
		wb1.click();
		Select sel=new Select(wb1);
		sel.selectByVisibleText(flib.getExcelData("Sheet2", 1, 3));
		System.out.println(wb1.getText());
		
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
		wb4.click();
		Select sel4=new Select(wb4);
		sel4.selectByVisibleText("ActiveProducts");
		
		String ActiveStatus=driver.findElement(By.xpath("//tr[@id='row_78']/td[4]")).getText();
		if(ActiveStatus.equals(flib.getExcelData("Sheet2", 1, 6))) {
			System.out.println("products in active condition only got displayed");
		}	
	}

}
