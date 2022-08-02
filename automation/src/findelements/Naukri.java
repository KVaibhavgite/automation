package com.findelements;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Naukri {

	static {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

	driver.get("https://www.naukri.com/"); 
	String parent = driver.getWindowHandle(); 
	System.out.println(parent); 
	Set<String> Win = driver.getWindowHandles(); 
	Win.remove(parent); 
	for (String CWin : Win)
	{ 
	Thread.sleep(2000); 
	System.out.println(CWin); 
	driver.switchTo().window(CWin); 
	driver.close(); 
	} 
}
}
