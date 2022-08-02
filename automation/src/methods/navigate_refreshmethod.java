package methods;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class navigate_refreshmethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
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
			driver.get("https://www.homecredit.co.in/en");
			driver.navigate();
			driver.findElement(By.xpath("/html/body/header/div[2]/div/div/div[3]/ul/li[1]/a")).click();
			Thread.sleep(2000);
			driver.navigate().back();
			driver.navigate().refresh();
			Thread.sleep(3000);
			driver.navigate().forward();
			driver.navigate().refresh();



		}
		else if(browservalue.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
			WebDriver driver=new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get("https://www.homecredit.co.in/en");
			driver.navigate();
			Thread.sleep(2000);
			driver.findElement(By.xpath("/html/body/header/div[2]/div/div/div[3]/ul/li[1]/a")).click();
			Thread.sleep(2000);
			driver.navigate().back();
			driver.navigate().refresh();
			Thread.sleep(3000);
			driver.navigate().forward();
			driver.navigate().refresh();

			
		}
		else if(browservalue.equalsIgnoreCase("edge"))
		{
			System.setProperty("webdriver.edge.driver","./drivers/msedgedriver.exe");
			WebDriver driver=new EdgeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.homecredit.co.in/en");driver.navigate();
			
			Thread.sleep(2000);
			driver.findElement(By.xpath("/html/body/header/div[2]/div/div/div[3]/ul/li[1]/a")).click();
			Thread.sleep(2000);
			driver.navigate().back();
			driver.navigate().refresh();
			Thread.sleep(3000);
			driver.navigate().forward();
			driver.navigate().refresh();




		}
		else
		{
			System.out.println("your input is wrong!!!!!1");
		}


	}

}
