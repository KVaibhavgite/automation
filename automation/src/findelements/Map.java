package com.findelements;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Map {
	WebDriver driver ;
	@BeforeClass
	
	
	public void beforeC()
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}
	
	@BeforeMethod
	public void beforeM()
	{
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.google.com");// load the url

		
	}

	@Test
	public void test1() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("google maps", Keys.ENTER);
		driver.findElement(By.xpath("//h3[@class='LC20lb']/following::div[1]/cite[contains(.,'https://maps.google.com')]")).click();
		driver.findElement(By.xpath("//div[@jstcache='574']")).click();
		driver.findElement(By.xpath("//button[@id='searchbox-directions']")).click();
		
		driver.findElement(By.xpath("//div[@class='widget-directions-waypoints']/descendant::input[2]")).sendKeys("BTM Layout",Keys.ENTER);
	 
	

}

}



