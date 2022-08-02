package tyss;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sele{
	
	
	static {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	}
	
	
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.seleniumhq.org/download/");
	
		driver.findElement(By.xpath("//td[text()='C#']/../td[4]/a")).click();
		Thread.sleep(1000);
		
	}
}