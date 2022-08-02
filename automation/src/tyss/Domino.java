
package tyss;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Domino{
	
	
	static {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	}
	
	
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.buydomino.com/OA_HTML/ibeCAcdLogin.jsp?ref=https%3A%2F%2Fwww.buydomino.com%3A443%2FOA_HTML%2FibeCZzdMinisites.jsp%3Fa%3Db");		
		Thread.sleep(2000);
		driver.findElement(By.id("username")).sendKeys("sawantsuraj743@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys("12345wer");
		Thread.sleep(2000);
		
		driver.findElement(By.className("buttonText")).click();
		Thread.sleep(2000);
			
		
	}
}
