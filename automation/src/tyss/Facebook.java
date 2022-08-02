package tyss;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook{
	
	
	static {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	}
	
	
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.facebook.com");
		
		Thread.sleep(2000);
		driver.findElement(By.id("email")).sendKeys("suraj");
		Thread.sleep(2000);
		//driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("pass")).sendKeys("123456");
		Thread.sleep(2000);
		driver.findElement(By.id("loginbutton")).click();
		Thread.sleep(2000);
			
		driver.close();
	}
}
