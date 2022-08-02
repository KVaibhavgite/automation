package com.testpom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.pom.SeleniumHome;

public class TestSelenium {

	static {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.seleniumhq.org");
		
		SeleniumHome sh=new SeleniumHome(driver);
		Thread.sleep(1000);
		sh.sendText("java");
		Thread.sleep(1000);
		sh.goClick();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(1000);
		sh.clearText();
		Thread.sleep(1000);
		sh.sendText("Testng");
		Thread.sleep(1000);
		sh.goClick();

}

}