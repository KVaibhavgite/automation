package com.findelements;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipkartJavaBook{
	

	static {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		 double i=0;
		 double big=0;
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/?affid=vignesh30");//load the url
		Thread.sleep(10000);
		//button[@class='_2AkmmA _29YdH8']
		driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@class='LM6RPg']")).sendKeys("java book",Keys.ENTER);
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@class='_3ywJNQ']/descendant::div[3]")).click();
		
		
		List<WebElement>rating=driver.findElements(By.xpath("//div[@class=\"_1HmYoV hCUpcT\"]/div[2]/descendant::div[@class=\"hGSR34\"]"));
		
		for(WebElement rates:rating)
		{
			String rate=rates.getText();
			System.out.println(rate);
			i = Double.parseDouble(rate);
			if(big<i)
			{
				big=i;
			}
			
		}
		System.out.println("highest rating : "+big);
		
		
		
		
		
	}
}