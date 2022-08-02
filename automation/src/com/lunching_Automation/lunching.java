package com.lunching_Automation;



import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.google.common.io.Files;

public class lunching {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		 driver.get("https://testing-assessment-foh15kew9-edvora.vercel.app/");
		 driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		 Alert alert = driver.switchTo().alert(); // switch to alert

		 String alertMessage= driver.switchTo().alert().getText(); // capture alert message

		 System.out.println(alertMessage); // Print Alert Message
		 Thread.sleep(5000);
		 alert.accept();
		driver.findElement(By.xpath("//div[@class='css-llqj01']//div[1]//div[1]//input[1]")).sendKeys("knowknow");
			
		driver.findElement(By.xpath("//div[@class='css-llqj01']//div[1]//div[1]//input[1]")).sendKeys("know");
		
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		
		
		
		//how to take the screenshot
		
		
				File src = ((RemoteWebDriver) driver).getScreenshotAs(OutputType.FILE);
				File dest = new File("./screenshots/screenshotTC01.png");
				Files.copy(src, dest);
		 driver.close();


	}

}


