package com.findelements;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNG {

	@Test

	public void testM() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");// load the url
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("Mobile", Keys.ENTER);
		driver.close();

		System.out.println("HiM");

	}

	@Test
	public void testM1() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");// load the url
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("Laptop", Keys.ENTER);
		driver.close();

		System.out.println("HiM1");

	}
}