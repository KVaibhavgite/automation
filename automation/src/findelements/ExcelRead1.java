package com.findelements;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExcelRead1 {
	@DataProvider
	public static String[][] createUser1() throws Exception {
		String[][] s;

		
		FileInputStream ff = new FileInputStream("H:\\ExcelSheet.xlsx");
		Workbook excel = WorkbookFactory.create(ff);

		Sheet sheet = excel.getSheet("Sheet1");
		s = new String[sheet.getPhysicalNumberOfRows() - 1][sheet.getRow(0).getLastCellNum()];
		for (int i = 1; i < sheet.getPhysicalNumberOfRows(); i++) {
			for (int j = 0; j < 1; j++) {
				Cell value = sheet.getRow(i).getCell(j);
				s[i - 1][j] = value.toString();
				Reporter.log(s[i - 1][j]);
			}
		}

		return s;

	}
	
	public static String[][] createUser2() throws Exception {
		String[][] s;

		
		FileInputStream ff = new FileInputStream("H:\\ExcelSheet.xlsx");
		Workbook excel = WorkbookFactory.create(ff);

		Sheet sheet = excel.getSheet("Sheet1");
		s = new String[sheet.getPhysicalNumberOfRows() - 1][sheet.getRow(0).getLastCellNum()];
		for (int i = 1; i < sheet.getPhysicalNumberOfRows(); i++) {
			for (int j = 1; j < 2; j++) {
				Cell value = sheet.getRow(i).getCell(j);
				s[i - 1][j] = value.toString();
				Reporter.log(s[i - 1][j]);
			}
		}

		return s;

	}
	
	public static String[][] createUser3() throws Exception {
		String[][] s;

		
		FileInputStream ff = new FileInputStream("H:\\ExcelSheet.xlsx");
		Workbook excel = WorkbookFactory.create(ff);

		Sheet sheet = excel.getSheet("Sheet1");
		s = new String[sheet.getPhysicalNumberOfRows() - 1][sheet.getRow(0).getLastCellNum()];
		for (int i = 1; i < sheet.getPhysicalNumberOfRows(); i++) {
			for (int j = 2; j < 3 ;j++) {
				Cell value = sheet.getRow(i).getCell(j);
				s[i - 1][j] = value.toString();
				Reporter.log(s[i - 1][j]);
			}
		}

		return s;

	}

	@Test(dataProvider = "createUser1")
	public void test0(String user) {
		Reporter.log(user, true);
		
	}
	
	@Test(dataProvider = "createUser2")
	public void test1(String pass) {
		Reporter.log(pass, true);
		
	}

	@Test(dataProvider = "createUser3")
	public void test2(String input) {
		Reporter.log(input, true);
	}

	
	
	
	
	
}