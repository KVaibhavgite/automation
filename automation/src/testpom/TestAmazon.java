package com.testpom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.pom.AmazonPom;
import com.pom.SeleniumHome;

public class TestAmazon {

	static {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.Amazon.in");
		
		AmazonPom ap=new AmazonPom(driver);
		
		Thread.sleep(1000);
		ap.sendText("iphone");
		
	Thread.sleep(1000);
	
	ap.goClick();
	Thread.sleep(1000);
	
	ap.mobileClick();
	Thread.sleep(1000);
	ap.addToCart();
	Thread.sleep(1000);
	ap.logoClick();
	Thread.sleep(1000);
	
	ap.sendText("oneplus");
	Thread.sleep(1000);
	ap.goClick();
		
		
		
}
}