package methods;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class closemethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//answer: driver.close will close the currently focused browser window
		//        driver.quit will close all the browser window associated with that driver instance.
		System.out.println("Enter the your browser :");
		//taking a input for user
		Scanner scan=new Scanner(System.in);
		String browservalue=scan.next();
		
		// lunching browser 
		if(browservalue.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
			Thread.sleep(2000);
			
			String parentWindow=driver.getWindowHandle();
			
			driver.findElement(By.id("newWindowBtn")).click();
			for(String windowHandle : driver.getWindowHandles()) 
			{
				if(!windowHandle.equals(parentWindow)) {
					driver.switchTo().window(windowHandle);
				}
			}
			driver.findElement(By.id("firstName")).sendKeys("HYR");
			Thread.sleep(3000);
			
			//close method are using the parent browser not a child browser
			//driver.close();
			driver.quit();


		}
		else if(browservalue.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
			WebDriver driver=new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
			Thread.sleep(2000);
			//close method are using the parent browser not a child browser
             String parentWindow=driver.getWindowHandle();
			
			driver.findElement(By.id("newWindowBtn")).click();
			for(String windowHandle : driver.getWindowHandles()) 
			{
				if(!windowHandle.equals(parentWindow)) {
					driver.switchTo().window(windowHandle);
				}
			}
			driver.findElement(By.id("firstName")).sendKeys("HYR");
			Thread.sleep(3000);
			
			driver.close();
			
		}
		else if(browservalue.equalsIgnoreCase("edge"))
		{
			System.setProperty("webdriver.edge.driver","./drivers/msedgedriver.exe");
			WebDriver driver=new EdgeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
			Thread.sleep(2000);
			//close method are using the parent browser not a child browser
			
			String parentWindow=driver.getWindowHandle();
			
			driver.findElement(By.id("newWindowBtn")).click();
			for(String windowHandle : driver.getWindowHandles()) 
			{
				if(!windowHandle.equals(parentWindow)) {
					driver.switchTo().window(windowHandle);
				}
			}
			driver.findElement(By.id("firstName")).sendKeys("HYR");
			Thread.sleep(3000);
			
			driver.close();


		}
		else
		{
			System.out.println("your input is wrong!!!!!1");
		}


	}

}
