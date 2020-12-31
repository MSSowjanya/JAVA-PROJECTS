package com.vTiger.objectRepositoryLib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class CreateFilterPage {
	
	@FindBy(name="viewName")
	private WebElement viewNameEdt;
	
	@FindBy(name="column1")
	private WebElement productInfoDd;
	
	@FindBy(name="column2")
	private WebElement handlerdd;
	
	@FindBy(name="column3")
	private WebElement optfield1dd;
	
	@FindBy(name="column4")
	private WebElement optfield2dd;
	
	@FindBy(id="pi")
	private WebElement stdFilterTab;
	
	@FindBy(id="mi")
	private WebElement advFilterTab;
	
	@FindBy(id="fcol0")
	private WebElement colListInAdvdd;
	
	@FindBy(id="fop0")
	private WebElement condDd;
	
	@FindBy(id="fval0")
	private WebElement condValueEdt;
	
	@FindBy(name="button2")
	private WebElement saveBtn;
	
	public void createFilter(String viewName, String optField, String valueForAdvFilt, String condition, String conditionValue) {
		viewNameEdt.sendKeys(viewName);
		
		optfield1dd.click();
		Select sel=new Select(optfield1dd);
		sel.selectByVisibleText(optField);
		
		advFilterTab.click();
		
		colListInAdvdd.click();
		Select sel1=new Select(colListInAdvdd);
		sel1.selectByVisibleText(valueForAdvFilt);
		
		condDd.click();
		Select sel2=new Select(condDd);
		sel2.selectByVisibleText(condition);
		
		condValueEdt.click();
		condValueEdt.sendKeys(conditionValue);
		
		saveBtn.click();
	}
	
}
