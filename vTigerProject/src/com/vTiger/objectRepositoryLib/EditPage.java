package com.vTiger.objectRepositoryLib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.vTiger.genericlib.BaseClass;

public class EditPage extends BaseClass{
	@FindBy(name="productname")
	private WebElement prodName;
	
	@FindBy(name="button")
	private WebElement saveButton;
	
	public void editProdName(String newProdName) {
		Products prod=PageFactory.initElements(driver, Products.class);
		prod.navigateToReacentProductToEdit();
		prodName.clear();
		prodName.sendKeys(newProdName);
		saveButton.click();
	}
	
	
	
}


