
package com.findelements;
	import java.awt.AWTException;
	import java.awt.Robot;
	import java.awt.event.KeyEvent;
	import java.io.File;
	import java.io.IOException;
	import java.util.List;

	import org.openqa.selenium.Alert;
	import org.openqa.selenium.By;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.OutputType;
	import org.openqa.selenium.TakesScreenshot;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.chrome.ChromeOptions;
	import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.support.ui.Select;

	import com.google.common.io.Files;

	public class FacebookNew{
	

			static {
				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			}

			public static void main(String[] args) throws InterruptedException,AWTException, IOException {
				
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://www.facebook.com");//load the url
				
				TakesScreenshot ts=(TakesScreenshot)driver;
				File sc=ts.getScreenshotAs(OutputType.FILE);
				File ff=new File("./Screenshot/DemoTwo.png");
				Files.copy(sc,ff);
				
			
	}
		}