package com.vTiger.objectRepositoryLib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import com.vTiger.genericlib.BaseClass;

public class HomePage extends BaseClass{
	@FindBy(xpath="//img[@src='themes/softed/images/user.PNG']")
	private WebElement userImage;
	
	@FindBy(linkText="Sign Out")
	private WebElement signOutLink;
	
	@FindBy(linkText="Products")
	private WebElement productsLink;
	
	@FindBy(linkText="Contacts")
	private WebElement contactsLink;
	
	public void logoutFromApp() {
		Actions act=new Actions(driver);
		act.moveToElement(userImage).perform();
		signOutLink.click();
	}
	
	public void navigateToProducts() {
		productsLink.click();
	}
	
	public void navigateToContacts() {
		contactsLink.click();
	}
}
