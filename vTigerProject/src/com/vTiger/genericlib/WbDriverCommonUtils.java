package com.vTiger.genericlib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class WbDriverCommonUtils extends BaseClass{
	public void waitForPageToLoad() {
		driver.manage().
	}
	
	public void moveMouse(WebElement element) {
		Actions act=new Actions(driver);
		act.moveToElement(element).perform();
	}
	
	public void select(WebElement element, String Option){
		Select sel=
	}
	
	public void impWait(int milliseconds) {
		
	}
	
	public void expWait() {
		wait
	}
	

}
