package com.findelements;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestFB {
	WebDriver driver;
	@BeforeClass
	public void beforeC()
	{	System.out.println("Before Class");
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}

	@BeforeMethod
	public void beforeM() throws InterruptedException 
	{
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");// load the url
		Thread.sleep(2000);
		System.out.println("BM");

	}
	
	@AfterMethod
	public void afterM() throws InterruptedException 
	{
		driver.close();
		System.out.println("AM");
	}
	
	@Test(priority=2)

	public void testM() throws InterruptedException {
	

		driver.findElement(By.id("email")).sendKeys("alia");
		Thread.sleep(1000);
		
		driver.findElement(By.id("pass")).sendKeys("1234",Keys.ENTER);
		System.out.println("HiM");

	}

	@Test(priority=1)
	public void testM1() throws InterruptedException {
		

		driver.findElement(By.id("email")).sendKeys("Ranbir");
		Thread.sleep(1000);
		
		driver.findElement(By.id("pass")).sendKeys("12345",Keys.ENTER);
		System.out.println("HiM1");
	}
		
		@AfterClass
		public void AfterC()
		{
			System.out.println("After Class");
		}
		

		

	
}