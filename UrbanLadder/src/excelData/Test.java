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

public class Test {
	static String tcName;
	static String colName;
	static FileInputStream fis;
	static Workbook wb;
	static Sheet sh;
	static Row row;
	static Cell cel;
	static int rowNum;
	static int colNum;
	public static void main(String[] args) throws Throwable {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the tc name");
		tcName=scan.next();
		System.out.println("Enter the Col name");
		colName=scan.next();
		System.out.println(getRowNum(tcName));
		System.out.println(getColNum(colName));
	}
	public static int getRowNum(String tcName) throws Throwable {
		fis=new FileInputStream(".//Testdata//TC.xlsx");
		wb=WorkbookFactory.create(fis);
		sh=wb.getSheet("Sheet1");
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
		fis=new FileInputStream(".//Testdata//TC.xlsx");
		wb=WorkbookFactory.create(fis);
		sh=wb.getSheet("Sheet1");
		row=sh.getRow(0);
		Iterator<Cell> it1=row.cellIterator();
		while(it1.hasNext()) {
			cel=it1.next();
//			System.out.println(cel.getColumnIndex());
			if(cel.getStringCellValue().equalsIgnoreCase(colName)) {
				colNum=cel.getColumnIndex();
			}
		}
		return colNum;
	}
}
