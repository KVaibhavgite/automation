package com.findelements;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.google.common.io.Files;

public class MouseOverUrbanLadder {

	static {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}

	public static void writeData(String sheet, int row, int col, String data)
			throws IOException, EncryptedDocumentException, InvalidFormatException {
		FileInputStream fis = new FileInputStream("C:\\Users\\HP\\Desktop\\Book4.xlsx");
		Workbook wb = WorkbookFactory.create(fis);

		wb.getSheet(sheet).createRow(row).createCell(col).setCellValue(data);
		FileOutputStream fio = new FileOutputStream("C:\\Users\\HP\\Desktop\\Book4.xlsx");

		wb.write(fio);
		wb.close();

	}

	public static void main(String[] args)
			throws InterruptedException, IOException, EncryptedDocumentException, InvalidFormatException {
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://www.urbanladder.com");// load the url
		Thread.sleep(6000);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[@class=\"close-reveal-modal hide-mobile\"]")).click();// close the pop up
		Thread.sleep(2000);

		List<WebElement> menu = driver.findElements(By.xpath("//div[@id='topnav_wrapper']/ul/li"));// x path for getting
																									// mouse over action
		Actions a = new Actions(driver);// To perform mouse overAction

		int row = 0;

		for (WebElement name : menu) {
			String menuName = name.getText();// to get the header text
			System.err.println(menuName);// to get the headers in red color like error
			a.moveToElement(name).build().perform();// to mouse over
			Thread.sleep(1000);

			List<WebElement> subMenu = driver.findElements(By
					.xpath("//span[contains(.,'" + menuName + "')]/parent::li/descendant::ul[@class='taxonslist']/li"));
			// for getting the submenus of different menu like concatination

			writeData("Sheet1", row, 0, name.getText());
			row++;

			for (WebElement item : subMenu) {
				System.out.println(item.getText());// display the submenus
				int col;
				writeData("Sheet1", row, 0, item.getText());
				row++;
			}

		}
	}
}
