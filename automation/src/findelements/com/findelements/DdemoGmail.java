package com.findelements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(Listgmail.class)
public class DdemoGmail {
	static WebDriver driver;
	
	
	
	
	@Test
	public void test1() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.gmail.com/");//load the url
		driver.findElement(By.id("identifierId")).sendKeys("surajraj19091997@gmail.com",Keys.ENTER);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.name("password")).sendKeys("kolzer$1319",Keys.ENTER);
		
		
		if(driver.getTitle().equalsIgnoreCase("Inbox"))
		{
			Reporter.log("logged in",true);
		}
		else
		{
			Reporter.log("logged in",true);
			Assert.fail();
		}
		
	}

	
	
	
}
