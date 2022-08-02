package tyss;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actilog2{
	
	
	static {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	}
	
	
	
	public static void main(String[] args) throws InterruptedException{
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://localhost/login.do");
		
		
		driver.findElement(By.cssSelector("input[name='username']")).sendKeys("admin");
		Thread.sleep(2000);
		//driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.cssSelector("input[name='pwd']")).sendKeys("manager");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Login']")).click();
		Thread.sleep(2000);
		
		String ExpectedTitle="actiTIME - Enter Time-Track";
		String ActualTitle=driver.getTitle();
		
		System.out.println(ActualTitle);
		
		
		if(ActualTitle.contains(ExpectedTitle))
		{
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
		System.out.println("title displayed and logged out");
		}
		else
		{
			System.out.println("title not displayed and not logged out");
		}
		
	}
}
