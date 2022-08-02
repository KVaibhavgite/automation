package com.findelements;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Files;

public class A2{

	static {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}
	
	

//	static int count=0;
//    public static void screen(WebDriver driver) throws IOException {
//	TakesScreenshot ts = (TakesScreenshot) driver;
//	File sc = ts.getScreenshotAs(OutputType.FILE);
//	File ff = new File("./Website2/Amazon" + count + ".png");
//	Files.copy(sc, ff);
//	count++;
//}
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");// load the url
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("OnePlus", Keys.ENTER);
		Thread.sleep(2000);
		JavascriptExecutor jse=(JavascriptExecutor)driver;//casting
		
		jse.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		int count;
			boolean b1;
			do {
		
			b1=driver.findElement(By.xpath("//span[text()='Next']")).isDisplayed();
			if(b1==true)
		{
				System.out.println("Google page " +count);
			driver.findElement(By.xpath("//span[text()='Next']")).click();
			count++;
			a++;
		}
			    }
		
	
			

		
		
		while(b1!=false);
		}
		catch(Throwable t) {
			System.out.println("End of pages");
	
}
}
}
	

