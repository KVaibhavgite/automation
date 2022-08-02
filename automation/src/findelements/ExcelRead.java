package com.findelements;

import java.io.FileInputStream;
import java.util.Scanner;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExcelRead {
	
	@DataProvider
	public static String[][] createUser1() throws Exception {
		String[][] s;

		
		FileInputStream ff = new FileInputStream("H:\\ExcelSheet.xlsx");
		Workbook excel = WorkbookFactory.create(ff);

		Sheet sheet = excel.getSheet("Sheet1");
		s = new String[sheet.getPhysicalNumberOfRows() - 1][sheet.getRow(0).getLastCellNum()];
		for (int i = 1; i < sheet.getPhysicalNumberOfRows(); i++) {
			for (int j = 0; j < sheet.getRow(i).getLastCellNum(); j++) {
				Cell value = sheet.getRow(i).getCell(j);
				s[i - 1][j] = value.toString();
				Reporter.log(s[i - 1][j]);
			}
		}

		return s;

	}
	
	
	@Test(dataProvider = "createUser1")
	

	public void test(String user, String pass,String input) {
		if(1==TestDataChal.x)
		{
			Reporter.log(user,true);
		}
		else if(2==TestDataChal.x)
		{
			Reporter.log(pass,true);
		}
		else if(3==TestDataChal.x)
		{
			Reporter.log(input,true);
		}
		else
		{
			System.out.println("Enter a valid choice");
		}
		

	}

}





























//package com.findelements;
//
//import java.io.FileInputStream;
//import java.util.Scanner;
//
//import org.apache.poi.ss.usermodel.Cell;
//import org.apache.poi.ss.usermodel.Sheet;
//import org.apache.poi.ss.usermodel.Workbook;
//import org.apache.poi.ss.usermodel.WorkbookFactory;
//import org.testng.Reporter;
//import org.testng.annotations.DataProvider;
//import org.testng.annotations.Test;
//
//public class ExcelRead {
//	static int x;
//	@DataProvider
//	public static String[][] createUser1() throws Exception {
//		String[][] s;
//
//		
//		FileInputStream ff = new FileInputStream("H:\\ExcelSheet.xlsx");
//		Workbook excel = WorkbookFactory.create(ff);
//
//		Sheet sheet = excel.getSheet("Sheet1");
//		s = new String[sheet.getPhysicalNumberOfRows() - 1][sheet.getRow(0).getLastCellNum()];
//		for (int i = 1; i < sheet.getPhysicalNumberOfRows(); i++) {
//			for (int j = 0; j < sheet.getRow(i).getLastCellNum(); j++) {
//				Cell value = sheet.getRow(i).getCell(j);
//				s[i - 1][j] = value.toString();
//				Reporter.log(s[i - 1][j]);
//			}
//		}
//
//		return s;
//
//	}
//	
//	
//	@Test(dataProvider = "createUser1")
//	
//
//	public void test(String user, String pass,String input) {
//		Scanner scanner=new Scanner(System.in);
//		System.out.println("Enter 1 if you want column username");
//		System.out.println("Enter 2 if you want column pass");
//		System.out.println("Enter 3 if you want column input");
//		
//		int choicee=scanner.nextInt();
//		x=choicee;
//		switch (x) {
//case 1:	Reporter.log(user, true);
//			
//			break;
//			
//case 2: Reporter.log(pass, true);
//			
//			break;
//
//			
//case 3:Reporter.log(input, true);
//	
//			break;
//
//
//		default:
//			System.out.println("Enter a valid choice");
//			break;
//		}
//
//	}
//
//}
