package tyss;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Smule{
	
	
	static {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	}
	
	
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.smule.com/recording/sign-up-sheet-please-click-and-then-go-from-there/301804386_101376991/ensembles");
		Thread.sleep(2000);
		
		driver.findElement(By.id("react-login-button")).click();
		Thread.sleep(2000);
		
		
		driver.findElement(By.className("_1agdv8e")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.name("email")).sendKeys("sawantsuraj743@gmail.com");
		Thread.sleep(2000);

		driver.findElement(By.id("pass")).sendKeys("9960062046");
		Thread.sleep(2000);
		
		
		driver.findElement(By.id("loginbutton")).click();
		Thread.sleep(2000);
		

		
		
		
		
		
		
		
		
			
		
	}
}
