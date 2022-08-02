package com.findelements;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Assignment4 {

	static {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException,AWTException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bluestone.com");
		driver.findElement(By.xpath("//input[@class='form-text typeahead']")).sendKeys("Rings",Keys.ENTER);
		
		Thread.sleep(6000);
		
		
		List<WebElement>menu=driver.findElements(By.xpath("//div[@class='grid-view browse-page-var2 g34 row grid-view-result-active']/ul[@class='product-grid search-box-result']/descendant::div/div/span[2]/span/span"));
		Actions a=new Actions(driver);
		Robot r = new Robot();
		
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,5000)");
//		Thread.sleep(1000);
//		
//	
//		Thread.sleep(9000);
		//div[@class='grid-view browse-page-var2 g34 row grid-view-result-active']/ul[@class='product-grid search-box-result']/descendant::div/div/span[2]/span
		
		int xpathCount=menu.size();
		System.out.println("The Number of Results found for Rings are "+xpathCount);
	}
}