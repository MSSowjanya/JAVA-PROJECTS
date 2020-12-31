package com.vTiger.testscripts;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.vTiger.genericlib.BaseClass;
import com.vTiger.objectRepositoryLib.CreateFilterPage;
import com.vTiger.objectRepositoryLib.HomePage;
import com.vTiger.objectRepositoryLib.Products;
/*
 * 
 */
public class FilterTest extends BaseClass{
	@Test(groups= {"SmokeTest"})
	public void createFilter() throws Throwable {
		String viewName=fLib.getExcelData("Sheet2", 1, 2);
		String optField=fLib.getExcelData("Sheet2", 1, 3);
		String valueForAdvFilt=fLib.getExcelData("Sheet2", 1, 4);
		String condition=fLib.getExcelData("Sheet2", 1, 5);
		String conditionValue=fLib.getExcelData("Sheet2", 1, 6);
		
		
		HomePage hp=PageFactory.initElements(driver, HomePage.class);
		hp.navigateToProducts();
		
		Products pr=PageFactory.initElements(driver, Products.class);
		pr.navigateToCreateFilterPage();
		
		CreateFilterPage CFP=PageFactory.initElements(driver, CreateFilterPage.class);
		CFP.createFilter(viewName, optField, valueForAdvFilt, condition, conditionValue);	
	}

}
