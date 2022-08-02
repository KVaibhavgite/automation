package com.findelements;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scenario6 {

	static {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bluestone.com");// load the url
		Thread.sleep(4000);
		
		
		List<WebElement>menu=driver.findElements(By.xpath("//nav[@class='wh-navbar']/descendant::li[2]"));//x path for getting mouse over action
		Actions a=new Actions(driver);//To perform mouse overAction
		
		
	
		for(WebElement name:menu)
		{		
			String menuName=name.getText();//to get the header text
			System.err.println(menuName);//to get the headers in red color like error
			a.moveToElement(name).build().perform();//to mouse over
			Thread.sleep(1000);
	}
}
}
