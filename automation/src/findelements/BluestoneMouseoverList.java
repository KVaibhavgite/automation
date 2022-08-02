package com.findelements;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BluestoneMouseoverList{

	static {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bluestone.com");//load the url
		Thread.sleep(8000);
		
	    List<WebElement> menu = driver.findElements(By.xpath("//nav[@class='wh-navbar']/descendant::ul[@class='wh-main-menu']/li"));
	    Actions a=new Actions(driver);
		Thread.sleep(4000);
		
		for(WebElement name:menu)
			{		
				String menuName=name.getText();//to get the header text
				System.err.println(menuName);//to get the headers in red color like error
				a.moveToElement(name).build().perform();//to mouse over
				Thread.sleep(1000);
	}
		
		
		for(WebElement name:menu)
			{		
				String menuName=name.getText();//to get the header text
				System.err.println(menuName);//to get the headers in red color like error
				a.moveToElement(name).build().perform();//to mouse over
				Thread.sleep(1000);
				
				List<WebElement> subMenu = driver.findElements(By.xpath("//a[contains(.,'"+menuName+"')]ancestor::nav/descendant::ul[@class='wh-main-menu']/descendant::ul[@class='odd-even-bg']/li[2]"));
				//for getting the submenus of different menu like concatination
				
				
				for(WebElement item:subMenu)
				{
					System.out.println(item.getText());//display the submenus
				}
		
		
		
				//a[contains(.,'')]/ancestor::nav/descendant::ul[@class='wh-main-menu']/li[2]/descendant::span
		
				//a[contains(.,'10+1 Monthly Plan')]/ancestor::nav/descendant::ul[@class='wh-main-menu']/li
		
		
				//a[contains(.,'Rings')]/ancestor::nav/descendant::ul[@class='wh-main-menu']/descendant::ul[@class='odd-even-bg']/li
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		driver.findElement(By.xpath("//a[@class=\"close-reveal-modal hide-mobile\"]")).click();//close the pop up
//		Thread.sleep(2000);
//		
//		
//		List<WebElement>menu=driver.findElements(By.xpath("//div[@id='topnav_wrapper']/ul/li"));//x path for getting mouse over action
//		Actions a=new Actions(driver);//To perform mouse overAction
//		
//		
//	
//		for(WebElement name:menu)
//		{		
//			String menuName=name.getText();//to get the header text
//			System.err.println(menuName);//to get the headers in red color like error
//			a.moveToElement(name).build().perform();//to mouse over
//			Thread.sleep(1000);
//			
//			List<WebElement> subMenu = driver.findElements(By.xpath("//span[contains(.,'"+menuName+"')]/parent::li/descendant::ul[@class='taxonslist']/li"));
//			//for getting the submenus of different menu like concatination
//			
//			
//			for(WebElement item:subMenu)
//			{
//				System.out.println(item.getText());//display the submenus
//			}
//			
		}
	}
	}
	