package com.findelements;




import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements1 {

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
		
		driver.findElement(By.xpath("//li[@class='topnav_item saleunit']/span[@class=\"topnav_itemname\"]")).click();
		Thread.sleep(3000);
		
		List<WebElement>menu=driver.findElements(By.xpath("//li[@class='topnav_item saleunit']/descendant::li[@class='sublist_item']/ul/li"));
		
		for(WebElement name:menu)
		{
			System.out.println(name.getText());
		}
			
		
		
	}}
