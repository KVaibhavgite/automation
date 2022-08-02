package tyss;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiveElement {
	
	
	static {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	}
	
	
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://localhost/login.do");
		
		
		
		
		WebElement AE=driver.switchTo().activeElement();
		
		
		
		
		AE.sendKeys("admin");
		Thread.sleep(2000);
		driver.quit();
		
	}

}
