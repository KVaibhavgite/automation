package com.findelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitlyWait {


	static {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	}
	
	
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("http://localhost/login.do");
		
	
		driver.findElement(By.cssSelector("input[name='username']")).sendKeys("admin");
		
		//driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.cssSelector("input[name='pwd']")).sendKeys("manager");
	
		driver.findElement(By.xpath("//td[3]/a")).click();
		
		WebDriverWait ww=new WebDriverWait(driver,1600);
		ww.until(ExpectedConditions.titleContains("X"));
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
		

	}

}
