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

public class SeleniumSearch {

	static {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.seleniumhq.org");// load the url
		Thread.sleep(6000);
	WebElement Search=	driver.findElement(By.id("q"));
	Thread.sleep(1000);
	Search.sendKeys("java",Keys.ENTER);
		
	Thread.sleep(2000);
	driver.navigate().back();
	Thread.sleep(1000);
	Search.clear();
	Thread.sleep(1000);
	driver.findElement(By.id("q")).sendKeys("java",Keys.ENTER);
		

		
	}
}