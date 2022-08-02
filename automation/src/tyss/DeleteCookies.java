package tyss;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteCookies {
	
	static {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		Thread.sleep(1000);
		
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		
		driver.quit();

	}

}
