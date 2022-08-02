package com.findelements;


import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Iphone{
	

	static {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		 double i=0;
		 double big=0;
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/?affid=vignesh30");//load the url
		Thread.sleep(10000);
		//button[@class='_2AkmmA _29YdH8']
		driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@class='LM6RPg']")).sendKeys("Iphone",Keys.ENTER);
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//div[@class=\"_3e7xtJ\"]/descendant::div[@class=\"_1HmYoV hCUpcT\"]/descendant::div[@data-id=\"MOBEMK62PN2HU7EE\"]")).click();
		Set<String>sabTab=driver.getWindowHandles();
		for(String tab:sabTab) {
			driver.switchTo().window(tab);
		}
		
		
	}
}