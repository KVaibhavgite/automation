package com.findelements;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class VisibilityOfText {
	static {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	}
	
	
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/HP/Desktop/VisibilityOfText.html");
		

		
		WebDriverWait ww=new WebDriverWait(driver,1600000000);
		ww.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("iamtextbox")))).sendKeys("abcdefg",Keys.ENTER);
		
		
	
	}

}
