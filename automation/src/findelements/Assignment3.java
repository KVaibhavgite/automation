package com.findelements;

import java.awt.AWTException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Assignment3 {

	static {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException,AWTException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("Java",Keys.ENTER);
		
		
		Thread.sleep(5000);
		
		List<WebElement>menu=driver.findElements(By.xpath("//div[@class='med']/descendant::h3")); 
		
		for(WebElement name:menu)
		{
			System.out.println(name.getText());
			
			
		}
		
		//div[@data-ved="0ahUKEwjz6fzN4aDlAhUSYysKHQEaCrUQGggt"]/descendant::h3
		
	}
}

