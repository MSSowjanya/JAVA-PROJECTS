package com.vTiger.testscripts;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.vTiger.genericlib.*;
import com.vTiger.objectRepositoryLib.CreateProductPage;
import com.vTiger.objectRepositoryLib.EditPage;
import com.vTiger.objectRepositoryLib.HomePage;
import com.vTiger.objectRepositoryLib.Products;


@Listeners(com.vTiger.genericlib.ListenerImp.class)
public class CeateProductTest extends BaseClass{
	
	
	@Test(groups= {"SmokeTest"})
	public void createProductTest() throws Throwable {
		//Read excel data
		String ProductName=fLib.getExcelData("Sheet1", 1, 2);
		
		HomePage hp=PageFactory.initElements(driver, HomePage.class);
		hp.navigateToProducts();
		
		Products ps=PageFactory.initElements(driver, Products.class);
		ps.navigateToCreateProductPage();
		
		CreateProductPage cp=PageFactory.initElements(driver, CreateProductPage.class);
		cp.createProductWithMandatoryFields(ProductName);
		
		hp.navigateToProducts();
		Thread.sleep(3000);
		
		Assert.assertEquals(ProductName, ps.getLastProduct());
	}
	
	@Test
	public void editProductTest() throws Throwable {
		String ProductName=fLib.getExcelData("Sheet1", 1, 2);
		String newProdName=fLib.getExcelData("Sheet1", 2, 2);
		
		HomePage hp=PageFactory.initElements(driver, HomePage.class);
		hp.navigateToProducts();
		
		Products ps=PageFactory.initElements(driver, Products.class);
		ps.navigateToCreateProductPage();
		
		CreateProductPage cp=PageFactory.initElements(driver, CreateProductPage.class);
		cp.createProductWithMandatoryFields(ProductName);
		
		hp.navigateToProducts();
		
		EditPage ep=PageFactory.initElements(driver, EditPage.class);
		ep.editProdName(newProdName);
		
		Assert.assertEquals(newProdName, ps.getLastProduct());
		
	}

}
