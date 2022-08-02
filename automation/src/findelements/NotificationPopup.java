
package com.findelements;
	import java.util.List;
	import org.openqa.selenium.By;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.chrome.ChromeOptions;
	import org.openqa.selenium.interactions.Actions;

	public class NotificationPopup{

		static {
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		}

		public static void main(String[] args) throws InterruptedException {
			
			
			ChromeOptions co=new ChromeOptions();
			co.addArguments("--disable-notifications");
			WebDriver driver = new ChromeDriver(co);
			driver.manage().window().maximize();
			driver.get("https://www.redbus.in/");//load the url
			Thread.sleep(10000);
		}
	}