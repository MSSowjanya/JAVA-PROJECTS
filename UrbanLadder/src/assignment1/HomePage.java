package assignment1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
	@FindBy(xpath="//a[@class='close-reveal-modal hide-mobile']")
	private WebElement closeBtn;
	
	@FindBy(xpath="//ul[@class='topnav bodytext']")
	private WebElement menu;
	
	@FindBy(xpath="//ul[@class='topnav_item saleunit']")
	private WebElement sales;
	
	public WebElement getCloseBtn() {
		return closeBtn;
	}
	public WebElement getMenu() {
		return menu;
	}
	public WebElement getsales() {
		return sales;
	}
	

}
