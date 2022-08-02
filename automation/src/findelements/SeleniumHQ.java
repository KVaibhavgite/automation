package com.findelements;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Files;

public class SeleniumHQ {

	static {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.seleniumhq.org");// load the url
		Thread.sleep(6000);
		JavascriptExecutor jse=(JavascriptExecutor)driver;//casting
		Thread.sleep(2000);
//		jse.executeScript("window.scrollBy(0,500)");
		jse.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		
		
		Thread.sleep(1000);
		jse.executeScript("window.scrollBy(0,-document.body.scrollHeight)");

////		jse.executeScript("window.scrollBy(0,-300)");
//		jse.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		
		
		Thread.sleep(2000);
		
		jse.executeScript("window.scrollBy(document.body.scrollWidth,0)");

		Thread.sleep(2000);
		
		jse.executeScript("window.scrollBy(-document.body.scrollWidth,0)");
		
		
		
	
		
		
		
		
		
		
	}
}