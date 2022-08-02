package com.findelements;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FaceBookAliaContains {
	static {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	}
	
	
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.id("email")).sendKeys("alia");
		
		
		WebDriverWait ww=new WebDriverWait(driver,1600000000);
		ww.until(ExpectedConditions.textToBePresentInElementValue(By.id("email"),"alia"));
		
		driver.findElement(By.id("pass")).sendKeys("1234",Keys.ENTER);
		
	}
}