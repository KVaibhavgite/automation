



package tyss;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Way2Sms{
	
	
	static {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	}
	
	
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.way2sms.com");		
		Thread.sleep(2000);
		driver.findElement(By.id("mobileNo")).sendKeys("8806433585");
		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys("12345wer");
		Thread.sleep(2000);
		
		driver.findElement(By.className("icon-right-long-h-arrow")).click();
		Thread.sleep(2000);
			
		
	}
}
