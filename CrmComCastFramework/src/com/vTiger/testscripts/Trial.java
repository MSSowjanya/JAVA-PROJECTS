package com.vTiger.testscripts;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.vTiger.genericLib.BaseClass;

public class Trial extends BaseClass{
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
