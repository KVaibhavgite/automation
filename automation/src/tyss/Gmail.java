package tyss;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail {
	
	static {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://www.google.com");
		Thread.sleep(2000);
		
		
		driver.get("http://gmail.com");
		Thread.sleep(2000);
		
		driver.navigate().back();
		Thread.sleep(2000);
		
		
		
		driver.navigate().forward();
		Thread.sleep(2000);
		
		
		driver.navigate().refresh();
		Thread.sleep(2000);
		
		
		
		
		driver.close();

	}

}