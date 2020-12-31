package com.vTiger.objectRepositoryLib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateProductPage {
	@FindBy(name="productname")
	private WebElement productNameEdit;
	
	@FindBy(name="button")
	private WebElement savebutton;

	public WebElement getProductNameEdit() {
		return productNameEdit;
	}

	public WebElement getSavebutton() {
		return savebutton;
	}
	
	public void createProductWithMandatoryFields(String prodName) {
		productNameEdit.sendKeys(prodName);
		savebutton.click();
	}
	
	

}
