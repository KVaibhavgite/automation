package com.findelements;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FacebookDOB{

	static {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");//load the url
		
		driver.findElement(By.xpath("//select[@name=\"birthday_day\"]/option[20]")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//select[@name=\"birthday_month\"]/option[10]")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//select[@name=\"birthday_year\"]/option[24]")).click();
	}
}