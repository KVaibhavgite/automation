package methods;

import java.util.Scanner;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class manage_setPosition {

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
			Point point=new Point(500, 700);
			driver.manage().window().setPosition(point);
			driver.get("https://www.homecredit.co.in/en");
		    
			Thread.sleep(3000);
			driver.close();


		}
		else if(browservalue.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
			WebDriver driver=new FirefoxDriver();
			Point point=new Point(500, 700);
			driver.manage().window().setPosition(point);
			driver.get("https://www.homecredit.co.in/en");
			
			Thread.sleep(2000);
			driver.close();
			
		}
		else if(browservalue.equalsIgnoreCase("edge"))
		{
			System.setProperty("webdriver.edge.driver","./drivers/msedgedriver.exe");
			WebDriver driver=new EdgeDriver();
			Point point=new Point(500, 700);
			driver.manage().window().setPosition(point);
			driver.get("https://www.homecredit.co.in/en");
			
			Thread.sleep(2000);
			driver.close();


		}
		else
		{
			System.out.println("your input is wrong!!!!!1");
		}


	}

}
