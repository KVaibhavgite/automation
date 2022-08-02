
package com.findelements;
	import java.awt.AWTException;
	import java.awt.Robot;
	import java.awt.event.KeyEvent;
	import java.io.IOException;
	import java.util.List;

	import org.openqa.selenium.Alert;
	import org.openqa.selenium.By;
	import org.openqa.selenium.Keys;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.chrome.ChromeOptions;
	import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.support.ui.Select;

	public class Guru99{

		static {
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		}

		public static void main(String[] args) throws InterruptedException,AWTException, IOException {
			
			
			ChromeOptions co=new ChromeOptions();
			co.addArguments("--disable-notifications");
			WebDriver driver = new ChromeDriver(co);
			TakesScreenshot
			driver.manage().window().maximize();
			driver.get("http://demo.guru99.com/test/upload/");//load the url
			Thread.sleep(2000);
		WebElement upload=driver.findElement(By.id("uploadfile_0"));
		upload.click();
		Runtime.getRuntime().exec("F:\\Auto.exe");
			
		}
	}
			