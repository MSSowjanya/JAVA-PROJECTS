package com.vTiger.genericLib;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileLib {
	/**
	 * 
	 * @param key
	 * @return
	 * @throws Throwable
	 */
	public String getPropertyKeyValue(String key) throws Throwable {
		FileInputStream fis=new FileInputStream("./commondata.properties");
		Properties pobj=new Properties();
		pobj.load(fis);
		String value=pobj.getProperty(key);
		return value;
	}
	/**
	 * 
	 * @param sheetName
	 * @param rowNum
	 * @param colNum
	 * @throws Throwable
	 */
	
	public String getExcelData(String sheetName, int rowNum, int colNum) throws Throwable {
		FileInputStream fis=new FileInputStream("./testData.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sh=wb.getSheet(sheetName);
		Row row=sh.getRow(rowNum);
		Cell cel=row.getCell(colNum);
		String data=cel.getStringCellValue();
		wb.close();
		return data;
	}
				
	/**
	 * 
	 * @param sheetName
	 * @param rowNum
	 * @param colNum
	 * @param data
	 * @throws Throwable
	 */
	public void setExcelData(String sheetName, int rowNum, int colNum, String data) throws Throwable{
		FileInputStream fis=new FileInputStream("./testData.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sh=wb.getSheet(sheetName);
		Row row=sh.getRow(rowNum);
		Cell cel=row.createCell(colNum);
		cel.setCellValue(data);
		FileOutputStream fos=new FileOutputStream("./testData.xlsx");
		wb.write(fos);
		wb.close();	
	}
	

}
