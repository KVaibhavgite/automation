package com.findelements;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
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

public class Scenario8 {

	static {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}
		static int count=0;
	public static void screen(WebDriver driver) throws IOException {

		TakesScreenshot ts = (TakesScreenshot) driver;
		File sc = ts.getScreenshotAs(OutputType.FILE);
		File ff = new File("./Screenshot88/Bluestone" + count + ".png");
		Files.copy(sc, ff);
		count++;

	}
	
	


	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bluestone.com");// load the url
		 Scenario7.screen(driver);


		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
		
	
		
		
		List<WebElement>menu=driver.findElements(By.xpath("//nav[@class='wh-navbar']/ul/li[6]"));//x path for getting mouse over action
		Actions a=new Actions(driver);//To perform mouse overAction
		 Scenario7.screen(driver);
		
		
	
		for(WebElement name:menu)
		{		
//			String menuName=name.getText();//to get the header text
//			System.err.println(menuName);//to get the headers in red color like error
			a.moveToElement(name).build().perform();//to mouse over
			 Scenario7.screen(driver);
			
	}
		driver.findElement(By.xpath("//a[contains(.,'Kadas')]")).click();
		 Scenario7.screen(driver);
		driver.findElement(By.xpath("//div[@id='grid-view-result']/ul/li[1]")).click();
		 Scenario7.screen(driver);
		 driver.findElement(By.xpath("//span[@class=\"icon-ion-android-arrow-dropdown\"]")).click();
		 Scenario7.screen(driver);
		 driver.findElement(By.xpath("//div[@class='scrollable-list active']/ul/li[1]")).click();
		 Scenario7.screen(driver);
		driver.findElement(By.id("buy-now")).click();
		
		 Scenario7.screen(driver);
		
		
//		
		 WebDriverWait ww=new WebDriverWait(driver,1600000000);
//		 Scenario7.screen(driver);
//		 ww.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='formErrorContent']")));
//		 Scenario7.screen(driver);
//		
//		
//		TakesScreenshot ts = (TakesScreenshot) driver;
//		File sc = ts.getScreenshotAs(OutputType.FILE);
//		File ff = new File("./Screenshot8f/Bluestone_Error_message.png");
//		Files.copy(sc,ff);
//		
//		System.out.println("Test case pass");
		
		
		
		
		
		
		//a[contains(.,'Kadas')]
}
}

