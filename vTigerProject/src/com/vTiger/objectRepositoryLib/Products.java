package com.vTiger.objectRepositoryLib;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.vTiger.genericlib.BaseClass;

public class Products extends BaseClass{
	@FindBy(xpath="//img[@src='themes/softed/images/btnL3Add.gif']")
	private WebElement createProductImg;
	
	@FindBy(linkText="Create Filter")
	private WebElement createFilterLink;
	
	@FindBy(id="viewname")
	private WebElement vieNamedd;
	
	@FindBy(xpath="//table/tbody/tr[*]/td[5]/a[1]")
	private WebElement productTable;
	
	@FindBy(xpath="(//a[text()='edit'])[last()]")
	private WebElement lastEdit;
	
	@FindBy(xpath="//table[@class='lvt small']/tbody/tr[last()]/td[3]/a")
	private WebElement lastProdName;
	
	
	@FindBy(xpath="//span[contains(text(),'Product Information')]")
	private WebElement productsHeaderText;
	
	////table[@class='lvt small']/tbody/tr[last()]/td[5]/a[1]
	
	public void navigateToCreateProductPage() {
		createProductImg.click();
	}
	
	public void navigateToCreateFilterPage() {
		createFilterLink.click();
	}
	
	public WebElement getVieNamedd() {
		return vieNamedd;
	}
	
	public WebElement getProductsHeaderText() {
		return productsHeaderText;
	}
	
	public void navigateToReacentProductToEdit() {
		lastEdit.click();
	}
	
	public String getLastProduct() {
		/*int index = driver.findElements(By.xpath("//table[@class='lvt small']/tbody/tr[*]/td[2]/a")).size();
		String x = "//table[@class='lvt small']/tbody/tr["+index+"]/td[2]/a";
		String lstProd=driver.findElement(By.xpath(x)).getText();*/
		String lstProd=lastProdName.getText();
		return lstProd;
	}
	
	
	
}
