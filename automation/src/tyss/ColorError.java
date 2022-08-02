package tyss;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ColorError{
	
	
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
		driver.findElement(By.cssSelector("input[name='pwd']")).sendKeys("manage");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Login']")).click();
		Thread.sleep(2000);
		
		String cssValue = driver.findElement(By.xpath("//span[text()='Username or Password is invalid. Please try again.']")).getCssValue("color");
	    System.out.println(cssValue);
		
		driver.close();
	}
}
