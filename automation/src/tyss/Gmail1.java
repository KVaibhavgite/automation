package tyss;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail1{
	
	
	static {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	}
	
	
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.gmail.com");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		
		driver.findElement(By.id("identifierId")).sendKeys("sawantsuraj743@gmail.com");
		
		driver.findElement(By.id("identifierNext")).click();
		
		driver.findElement(By.name("password")).sendKeys("123456");
	
		driver.findElement(By.id("passwordNext")).click();
		
			
		
	}
}
