package com.findelements;

import java.awt.AWTException;
import java.awt.Robot;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hindi {

	static {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Thread.sleep(1000);
		
		
		String name=driver.findElement(By.xpath("//div[@id='SIvCob']//a[1]")).getText();
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys(name);
		Thread.sleep(1000);
			

		driver.findElement(By.xpath("//div[@class='aajZCb']/descendant::li[3]")).click();
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='sfbg nojsv']/following::form/div[2]//descendant::div[7]/div[@class='vdLsw gsfi']")).getText();
		Thread.sleep(1000);
		String name1=driver.findElement(By.xpath("//div[@class='sfbg nojsv']/following::form/div[2]//descendant::div[7]/div[@class='vdLsw gsfi']")).getText();
		Thread.sleep(1000);
		
		String name2=driver.findElement(By.xpath("//div[@class='cu-container']/div/span/div/div/div/span/following::span/div[2]/following::div[4]/span")).getText();
		Thread.sleep(1000);
		
		if(name1.equals(name2)==false);
		{
		System.out.println("not equal");
		}
		
	
	
	}
}