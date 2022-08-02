package wedriverLocaters;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class locaterdemo01 {

	public static void main(String[] args) throws InterruptedException {
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
			//driver.get("https://www.facebook.com/login/?privacy_mutation_token=eyJ0eXBlIjowLCJjcmVhdGlvbl90aW1lIjoxNjUzODc4MzEyLCJjYWxsc2l0ZV9pZCI6MzgxMjI5MDc5NTc1OTQ2fQ%3D%3D");
			//Thread.sleep(2000);
			
			//*id locater and tag
			//driver.findElement(By.id("email")).sendKeys("sadhvisingh24@gmail.com");
			//driver.findElement(By.id("pass")).sendKeys("passward");
			//driver.findElement(By.tagName("button")).click();
			
			//*linktext or partiallinktext
			//driver.findElement(By.linkText("Forgotten account?")).click();
			//driver.findElement(By.partialLinkText("Forgotten account?")).click();
			
			//*class locater
			//driver.get("https://www.flipkart.com/");
			//int prods=driver.findElement(By.className("eFQ30H")).size();
			//System.out.println(prods);
			
			//cssSelector locater
			driver.get("https://www.facebook.com/login/");
			Thread.sleep(2000);
			driver.findElement(By.cssSelector("input#email")).sendKeys("4655496656");
			driver.findElement(By.cssSelector("#pass")).sendKeys("passward");
			
			


		}
		else if(browservalue.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
			WebDriver driver=new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get("https://www.facebook.com/login/?privacy_mutation_token=eyJ0eXBlIjowLCJjcmVhdGlvbl90aW1lIjoxNjUzODc4MzEyLCJjYWxsc2l0ZV9pZCI6MzgxMjI5MDc5NTc1OTQ2fQ%3D%3D");
			Thread.sleep(2000);
			
		}
		else if(browservalue.equalsIgnoreCase("edge"))
		{
			System.setProperty("webdriver.edge.driver","./drivers/msedgedriver.exe");
			WebDriver driver=new EdgeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.facebook.com/login/?privacy_mutation_token=eyJ0eXBlIjowLCJjcmVhdGlvbl90aW1lIjoxNjUzODc4MzEyLCJjYWxsc2l0ZV9pZCI6MzgxMjI5MDc5NTc1OTQ2fQ%3D%3D");
			Thread.sleep(2000);


		}
		else
		{
			System.out.println("your input is wrong!!!!!1");
		}



	}

}
