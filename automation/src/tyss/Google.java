package tyss;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {

	static {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("Java");

		// driver.findElement(By.xpath("//div[@class='FPdoLc
		// VlcLAe']/center/input[@name='btnI']")).click();

		driver.findElement(By.xpath("//div[@class='FPdoLc VlcLAe']/center/input[@class=\"gNO89b\"]")).click();

		Thread.sleep(1000);

		System.out.println(driver.getTitle());
		Thread.sleep(2000);

		driver.findElement(
				By.xpath("//div[@data-hveid=\"CAAQAA\"]/descendant::h3[@class=\"LC20lb\"]")).click();

		// div[@data-hveid='CAcQAQ']/div[@class='rc']/div[@class='r']/a/h3[@class='LC20lb']        //mine one
		Thread.sleep(1000);

		System.out.println(driver.getTitle());
	}
}