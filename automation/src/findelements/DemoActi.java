package com.findelements;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DemoActi {
	static {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	}
	
	
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager",Keys.ENTER);
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@class='menuTable']/div[3]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[contains(.,'About your actiTIME')]")).click();
		
		Thread.sleep(2000);
		String txt = driver.findElement(By.xpath("//td[@class='aboutFooter']/table/descendant::td[2]")).getText();
		System.out.println(txt);
	}
}
		




