package com.findelements;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GmailFake{

	static {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.gmail.com/");//load the url
//		driver.findElement(By.xpath("//div[text()='Use another account']")).click();
		driver.findElement(By.id("identifierId")).sendKeys("surajraj19091997@gmail.com",Keys.ENTER);
		
		driver.findElement(By.name("password")).sendKeys("kolzer$1319",Keys.ENTER);
		
		
//		driver.findElement(By.xpath("//a[@class='gb_B']")).click();
//		driver.findElement(By.id("ogbkddg:6")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[text()='Compose']")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.name("to")).sendKeys("sawantsuraj743@gmail.com",Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.name("subjectbox")).sendKeys("aditi");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//table[@class='aoP aoC']/descendant::table[4]/descendant::div[4]")).sendKeys("aditi");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='aDh']/table/tbody/tr/td/div/div/div")).click();
		
		
		
	}
}