package com.findelements;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FacebookRightClick{

	static {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");//load the url

		Thread.sleep(2000);
		driver.findElement(By.id("email")).sendKeys("suraj");
		Thread.sleep(2000);
		//driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("pass")).sendKeys("123456");
		Thread.sleep(2000);
		
		
	
	
		
			
			WebElement Log_in = driver.findElement(By.xpath("//td[3]/label/input"));
			Actions a=new Actions(driver);
			a.contextClick(Log_in).perform();
			
			//for getting the submenus of different menu like concatination
			
			
		
	}
	}