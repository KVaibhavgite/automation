package com.findelements;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class JqueryDrop{

	static {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable/");//load the url
		
		
		
		
		WebElement frame=driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(frame);
		
		
		
		
		Actions a=new Actions(driver);
		WebElement drag=driver.findElement(By.id("draggable"));
		Thread.sleep(1000);
		WebElement drop=driver.findElement(By.id("droppable"));
		
		Thread.sleep(1000);
		a.dragAndDropBy(drag, 180, 60).perform();
		
		boolean b1=driver.findElement(By.id("droppable")).isDisplayed();
		
		if(b1)
			
		{
			System.out.println("Dropping Verified");
		}
			
			else
			{
				System.out.println("Dropped is not displayed");
			}
			
		
		
		
		
		
		
		
		
	}
}
