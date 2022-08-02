package tyss;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiLogin{
	
	
	static {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	}
	
	
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://localhost/login.do");
		
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[name='username']")).sendKeys("admin");
		Thread.sleep(2000);
		//driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.cssSelector("input[name='pwd']")).sendKeys("manager");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//td[3]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
		Thread.sleep(1000);
		
		driver.close();
	}
}
