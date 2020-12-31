package assignment1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class MenuListToExcel {
	@Test
	public void getMenu() throws Throwable {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.urbanladder.com/");
		
		HomePage hp=PageFactory.initElements(driver, HomePage.class);
		
		hp.getCloseBtn().click();
		int rowNum=1;
		int cellNum1=0;
		
		List<WebElement> menu = driver.findElements(By.xpath("//span[@class='topnav_itemname']"));
		for(int i=0; i<menu.size(); i++) {
			WebElement wb1=menu.get(i);
			System.out.println(wb1.getText());
			
			SoftAssert s=new SoftAssert();
			/*Write data to excel*/
			String data1=wb1.getText();
			
			int cellNum=1;
			writeToExcel("Sheet1", rowNum, cellNum, data1);
			rowNum++;
			
			String exp1=readFromExcel("Sheet1", rowNum, cellNum1);
			s.assertEquals(data1, exp1);
			
			Actions act=new Actions(driver);
			Thread.sleep(2000);
			act.moveToElement(wb1).perform();
			
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			List<WebElement> subMenu=driver.findElements(By.xpath("//div/ul[@class='topnav bodytext']/child::li/child::span[contains(.,'"+wb1.getText()+"')]/parent::li/descendant::li[@class='sublist_item']/child::div/child::a"));
			Thread.sleep(2000);
			for(int j=0;j<subMenu.size();j++) {
				WebElement wb2=subMenu.get(j);
				System.out.println("	"+wb2.getText());
				String data2=wb2.getText();
				
				writeToExcel("Sheet1", rowNum, cellNum, data2);
				rowNum++;
				String exp2=readFromExcel("Sheet1", rowNum, cellNum1);
				s.assertEquals(data2, exp2);
				List<WebElement> ssMenu=driver.findElements(By.xpath("//div[@id='topnav_wrapper']/ul[@class='topnav bodytext']/child::li/child::span[contains(.,'"+wb1.getText()+"')]/parent::li/descendant::li[@class='sublist_item']/child::div/child::a[text()='"+wb2.getText()+"']/parent::div/following-sibling::ul/descendant::span"));
				Thread.sleep(2000);
				for(int k=0; k<ssMenu.size();k++) {
					WebElement wb3=ssMenu.get(k);
					System.out.println("             "+wb3.getText());
					String data3=wb3.getText();
					writeToExcel("Sheet1", rowNum, cellNum, data3);
					rowNum++;
					
					String exp3=readFromExcel("Sheet1", rowNum, cellNum1);
					s.assertEquals(data3, exp3);
				}
			}
		}
	driver.close();
	}
	public void writeToExcel(String sheet, int rowNum, int cellNum, String data) throws Throwable{
		FileInputStream fis=new FileInputStream("./TestData/UrbanLadderMenu.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sh=wb.getSheet(sheet);
		
		Row row=sh.getRow(rowNum);
		Cell cel=row.getCell(cellNum);
		cel.setCellValue(data);
		FileOutputStream fos=new FileOutputStream("./TestData/UrbanLadderMenu.xlsx");
		wb.write(fos);
		wb.close();	
	}
	public String readFromExcel(String sheet, int rowNum, int cellNum) throws Throwable{
		FileInputStream fis=new FileInputStream("./TestData/UrbanLadderMenu.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sh=wb.getSheet(sheet);
		Row row=sh.getRow(rowNum);
		Cell cel=row.getCell(cellNum);
		String data=cel.getStringCellValue();
		return data;
	}
}
