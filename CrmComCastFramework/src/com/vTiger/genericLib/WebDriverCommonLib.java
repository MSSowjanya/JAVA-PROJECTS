package com.vTiger.genericLib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverCommonLib {

		
	public void waitAndClick(WebElement wb) throws Throwable {
		int count = 0;
		while(count<20) {
			try {
			  wb.click();
			  break;
			}catch (Throwable t) {
				Thread.sleep(1000);
				t.printStackTrace();

			}
		}
	}

}
