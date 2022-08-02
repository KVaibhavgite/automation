package com.findelements;




import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Salee {

	static {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.urbanladder.com/");
		Thread.sleep(10000);
		driver.findElement(By.xpath("//a[@class=\"close-reveal-modal hide-mobile\"]")).click();
		Thread.sleep(2000);
		
		
		List<WebElement>menu=driver.findElements(By.xpath("//li[@class='topnav_item saleunit']/span[@class=\"topnav_itemname\"]"));
		
		int a=menu.size();
		if(a>0) {
			System.out.println("element is present");
		}
		
		else
		{
			System.out.println("not present");
		}
			
		
		
	}}
