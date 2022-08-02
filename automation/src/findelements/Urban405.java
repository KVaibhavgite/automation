package com.findelements;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Urban405 {

	
		WebDriver driver;
		
		@BeforeClass
		
		public void BeforeClass()
		{
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		}
		
@BeforeMethod
		
		public void beforeM()
		{

			driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			driver.get("file:///C:/Users/HP/Desktop/pras.html");//load the url
			
			
			
		}
	@Test	
			
		
public void test1()throws InterruptedException,IOException
{
	
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);




List<WebElement> link = driver.findElements(By.xpath("//a"));
for (WebElement li : link) {
	String link1 = li.getAttribute("href");
	URL u = new URL(link1);
	HttpsURLConnection con = (HttpsURLConnection) u.openConnection();
	int rcode = con.getResponseCode();
	if (rcode == 200) {
		System.out.println(rcode);
		System.out.println("Link is not broken");
		System.out.println(con.getResponseCode());
	} else {
		System.out.println(rcode);
		System.out.println("Link is broken");
		System.out.println(con.getResponseCode());
	}
}



}
}
		