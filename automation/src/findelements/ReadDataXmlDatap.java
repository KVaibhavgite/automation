package com.findelements;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ReadDataXmlDatap {
	@DataProvider
	public static String[][] createUser() throws Exception {
		String[][] s;

		
		FileInputStream ff = new FileInputStream("H:\\\\twoD.xlsx");
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

	@Test(dataProvider = "createUser")
	public void test(String user, String pass) {
		Reporter.log(user, true);
		Reporter.log(pass, true);

	}

}
