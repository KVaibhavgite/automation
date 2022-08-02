package tyss;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UrbanAssign {

	static {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.urbanladder.com/");
		Thread.sleep(10000);
		driver.findElement(By.xpath("//a[@class=\"close-reveal-modal hide-mobile\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("Sofa",Keys.ENTER);

		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//li[@data-vid='33991']")).click();
		Thread.sleep(4000);
		
		//div[@class='right close-head-alert']
		driver.findElement(By.xpath("//div[@class='icofont-cross']")).click();
		Thread.sleep(4000);
		
		
		driver.findElement(By.xpath("//div[@class='header__topBar-content']")).click();
		Thread.sleep(3000);
		//div[@pid='3755']
	
		driver.findElement(By.xpath("//div[@class='col-md-5 no-padding text-right action-section']/a[@data-gaclick='1']")).click();
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@id='add-to-cart-button']")).click();
		
		
		//checkout
		 
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='large-4 columns btn_wrap']/button[@class='action-button checkout-button']")).click();
		//div[@class='large-4 columns btn_wrap']/button[@class='action-button checkout-button']
		
		
		//li[@data-vid='33991']
	}
}