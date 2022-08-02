package tyss;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActitimeAutomate {
	
	
	static {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	}
	
	
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://localhost/login.do");
		
		//use the locator name  for click
			//	driver.findElement(By.("n1")).click();
				
   
		driver.findElement(By.cssSelector("input[username='admin']")).click();
		
		
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[password='manager']")).click();
		
		
		
		driver.get("file:///C:/Users/HP/Desktop/actitime.html");
		driver.findElement(By.xpath("//a[text()='Login'")).click();

		
		
		
	}

}
