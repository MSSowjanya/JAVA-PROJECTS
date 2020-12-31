package excelData;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Iterator;
import java.util.Scanner;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class GetDetails {
	static String tcName;
	static String colName;
	static FileInputStream fis;
	static Workbook wb;
	static Sheet sh;
	static Row row;
	static Cell cel;
	static int rowNum;
	static int colNum;
	@Test
	public static void get() throws Throwable {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the tc name");
		String tcName=scan.next();
		System.out.println("Enter the Col name");
		String colName=scan.next();
		System.out.println(getDet(tcName,colName));
		
	}
	public static String getDet(String tcName, String reqdetais) throws Throwable{
		fis=new FileInputStream(".//Testdata//TC.xlsx");
		wb=WorkbookFactory.create(fis);
		sh=wb.getSheet("Sheet1");
		row=sh.getRow(getRowNum(tcName));
		System.out.println(sh.getPhysicalNumberOfRows());
		System.out.println(sh.getLastRowNum());
		cel=row.getCell(getColNum(reqdetais));
		System.out.println(row.getPhysicalNumberOfCells());
		System.out.println(row.getLastCellNum());
		
		String data=cel.getStringCellValue();
		return data;
	}
	public static int getRowNum(String tcName) throws Throwable {
		Iterator<Row> it=sh.rowIterator();
		while(it.hasNext()){
			row=it.next();
			if(row.getCell(1).getStringCellValue().equalsIgnoreCase(tcName)) {
				rowNum=row.getRowNum();
			}
		}
		return rowNum;
	}
	public static int getColNum(String colName) throws Throwable {
		row=sh.getRow(0);
		Iterator<Cell> it1=row.cellIterator();
		while(it1.hasNext()) {
			cel=it1.next();
			if(cel.getStringCellValue().equalsIgnoreCase(colName)) {
				colNum=cel.getColumnIndex();
			}
		}
		return colNum;
	}
}
