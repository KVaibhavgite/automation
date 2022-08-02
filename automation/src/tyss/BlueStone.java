package tyss;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BlueStone {

	static {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bluestone.com");
		
		
		driver.findElement(By.xpath("//input[@class='form-text typeahead']")).sendKeys("Ring",Keys.ENTER);
		
		driver.findElement(By.xpath("//a[@id=\"pid_41483\"]/img[@class=\"hc img-responsive center-block\"]")).click();
	
		Thread.sleep(6000);
		
		driver.findElement(By.xpath("//span[@class='ring-size-box']")).click();
		
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//li[@data-key='8']")).click();
	
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='buy-now']")).click();
		
		
	}
}