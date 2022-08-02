package com.findelements;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GoogleTab {

	static {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}

	public static void main(String[] args) throws AWTException, InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");// load the url
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("Java", Keys.ENTER);

		// div[@class='kno-ecr-pt kno-fb-ctx PZPZlf gsmt']

		WebElement doubleT = driver.findElement(By.xpath("//div[@class='kno-ecr-pt kno-fb-ctx PZPZlf gsmt']/span"));
		Actions a = new Actions(driver);
		a.doubleClick(doubleT).perform();
		Thread.sleep(3000);

		// open the tab with keyboard

		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_C);
		r.keyRelease(KeyEvent.VK_C);
		r.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(3000);

		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_T);
		r.keyRelease(KeyEvent.VK_T);
		r.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(3000);

		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(3000);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		
		
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_W);
		r.keyRelease(KeyEvent.VK_W);
		r.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(3000);
		
	

	}
}
