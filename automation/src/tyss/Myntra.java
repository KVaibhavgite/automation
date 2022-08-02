
package tyss;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Myntra{
	
	
	static {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	}
	
	
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.myntra.com/login");		
		Thread.sleep(2000);
		driver.findElement(By.name("email")).sendKeys("sawantsuraj743@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("12345wer");
		Thread.sleep(2000);
		
		driver.findElement(By.className("login-login-button")).click();
		Thread.sleep(2000);
			
		
	}
}
