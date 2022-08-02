package com.findelements;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Jquery{

	static {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/slider/");//load the url
		
		
		
//		
//		WebElement frame=driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
//		driver.switchTo().frame(frame);
		
		
		
		
		
		WebElement drag= driver.findElement(By.xpath("//body/div/span"));
		Actions a=new Actions(driver);
//		a.dragAndDropBy(drag,200,0).perform();	
		
//		a.doubleClick(drag).perform();
		
		
		
		
		
		
	}
}
