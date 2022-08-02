package com.findelements;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class FaceBook2{

	static {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");//load the url
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		String s1=driver.findElement(By.xpath("//label[contains(.,'Email or Phone')]")).getText();
		
		driver.findElement(By.xpath("//div[@class='clearfix loggedout_menubar']/descendant::input[3]")).sendKeys(s1);
		//div[@class='clearfix loggedout_menubar']/descendant::input[3]
	}
}