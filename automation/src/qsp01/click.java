package qsp01;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class click {
	
	 public static void main()
	 {
	 //1. Open the Chrome Browser
		 System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	 WebDriver driver = new ChromeDriver();
	 //2. Using Implicitly Wait Command
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 //Open the URL
	 driver.get("http://www.google.com"); 
	 //Get and store page title in to variable 
	 String title = driver.getTitle();
	 System.out.print(title); 
	 //Get current page URL
	 String CurrentURL = driver.getCurrentUrl();
	 System.out.println("My Current URL Is : "+CurrentURL);
	 
	 //Get and store domain name in variable using JavaScript Executor
	 JavascriptExecutor javascript = (JavascriptExecutor) driver;
	 String DomainUsingJS=(String)javascript.executeScript("return document.domain");
	 System.out.println("My Current URL Is : "+DomainUsingJS);
	 // Checked for search box is enabled or not
	 if (driver.findElement(By.xpath("//input[@name='q']")).isEnabled())
	 {
	 System.out.println("Google search text box Is enabled.");
	 // Pass the Test - "WebDriver Test Successful" to search box
	 driver.findElement(By.xpath("//input[@name='q']")).sendKeys("WebDriver Test successful.");
	 // clicking the search button
	 driver.findElement(By.xpath("//button[@name='btnG']")).click();
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 // Click the Top most link and open to New Tab
	 WebElement link=driver.findElement(By.xpath("//div[@id='ires']/ol/div/div[1]/div/h3/a"));
	 Actions newTab = new Actions(driver);
	 newTab.keyDown(Keys.CONTROL).keyDown(Keys.SHIFT).click(
	link).keyUp(Keys.CONTROL).keyUp(Keys.SHIFT).build().perform();
	 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	 }
	 }
	}
