package com.findelements;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class FacebookDOB2{

	static {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");//load the url
		
	Thread.sleep(2000);
	
	WebElement day=driver.findElement(By.id("day"));
	Select s=new Select(day);
//	s.selectByValue("19");
	List<WebElement>days=s.getOptions();
	for(WebElement dy:days)
	{
		System.out.println(dy.getText());
	}
	Thread.sleep(1000);
	
	WebElement month=driver.findElement(By.id("month"));
	Select s1=new Select(month);
//	s1.selectByValue("09");
	List<WebElement>months=s.getOptions();
	for(WebElement mon:days)
	{
		System.out.println(mon.getText());
	}
	Thread.sleep(1000);
	
	WebElement year=driver.findElement(By.id("year"));
	Select s2=new Select(year);
//	s2.selectByValue("1997");
	List<WebElement>years=s.getOptions();
	for(WebElement yea:days)
	{
		System.out.println(yea.getText());
	}
	
	Thread.sleep(1000);
	}
}
	
//	
	