package com.findelements;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import org.testng.annotations.Test;

public class UrbanFetch {
WebDriver driver;
	@BeforeClass
	public void beforeC()
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}
	@BeforeMethod
	public void before()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.urbanladder.com");// load the url
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[@class=\"close-reveal-modal hide-mobile\"]")).click();

	}
	@Test
	public void test()
	{
		// close the pop up
		driver.findElement(By.xpath("//li[2]/a[@class=\"featuredLinksBar__link\"]")).click();
		List<WebElement> menu = driver.findElements(By.xpath("//div[@class='_3oCTi']/a/div/descendant::h3"));

		for (WebElement name : menu) {
			String menuName = name.getText();// to get the header text
			System.out.println(menuName);// to get the headers in re
	}
	}
	
	
//	@AfterMethod
//	public void after()
//	{
//		driver.close();
//	}
	
	
	
	
}
