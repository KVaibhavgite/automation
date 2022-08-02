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

public class Ebay {
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
		driver.get("https://www.ebay.com");// load the url

		
	}

	@Test
	public void test1() throws InterruptedException {
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
		driver.findElement(By.name("_nkw")).sendKeys("apple watch",Keys.ENTER);
	List<WebElement>texts=driver.findElements(By.xpath("//div[@class='srp-river srp-layout-inner']/div/div/following::div/descendant::h3[@class='s-item__title']"));
		
	for(WebElement name:texts)
	{		
		String Links=name.getText();
		System.out.println(Links);
	}
	
	
	 Select s= new Select(driver.findElement(By.xpath("//div[@class='srp-river srp-layout-inner']/div/div/following::div/descendant::h3[@class='s-item__title']/parent::a"))); 
	 JavascriptExecutor js = (JavascriptExecutor) driver; 
	 String name11= s.getFirstSelectedOption().getText(); 
	 js.executeScript("arguments[0].scrollIntoView()",name11 ); 
	  
	   

	 
	

}

}



