package tyss;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Thanos{

	static {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("Thanos",Keys.ENTER);
		
		Thread.sleep(1000);
		String fetch=driver.findElement(By.xpath("//div[@id='resultStats']")).getText();
		
		System.out.println(fetch);
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//canvas[@class='c3yYr']")).click();
		Thread.sleep(3000);
		String fetch1=driver.findElement(By.xpath("//div[@id='resultStats']")).getText();
		
		System.out.println(fetch1);
		
		
		
		
		
		
//
//		System.out.println(driver.getTitle());
//		Thread.sleep(2000);
//
//		driver.findElement(
//				By.xpath("//div[@data-hveid=\"CAAQAA\"]/descendant::h3[@class=\"LC20lb\"]")).click();
//
//		// div[@data-hveid='CAcQAQ']/div[@class='rc']/div[@class='r']/a/h3[@class='LC20lb']        //mine one
//		Thread.sleep(1000);
//
//		System.out.println(driver.getTitle());
//	}
}}
