package com.vTiger.genericlib;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileLib {
	public String getPropertyKeyValue(String key) throws Throwable {
		FileInputStream fis= new FileInputStream(".//data//commonData.properties");
		Properties pObj=new Properties();
		pObj.load(fis);
		String value=pObj.getProperty(key);
		return value;
	}
	public String getExcelData(String sheetName, int rowNum, int colNum) throws Throwable{
		FileInputStream fis=new FileInputStream(".//data//testData.xlsx");
		Workbook wb= WorkbookFactory.create(fis);
		Sheet sh=wb.getSheet(sheetName);
		Row row=sh.getRow(rowNum);
		Cell cel=row.getCell(colNum);
		String data=cel.getStringCellValue();
		wb.close();
		return data;
	}
	public void setExcelData(String sheetName, int rowNum, int colNum) throws Throwable {
		FileInputStream fis=new FileInputStream(".//data//testData.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sh=wb.getSheet(sheetName);
		Row row=sh.getRow(rowNum);
		Cell cel=row.createCell(colNum);
		FileOutputStream fos=new FileOutputStream(".//data//testData.xlsx");
		wb.write(fos);
		wb.close();
	}
}
