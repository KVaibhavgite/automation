

	import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.chrome.ChromeOptions;
	import org.openqa.selenium.interactions.Actions;

	public class AlertPopup{

		static {
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		}

		public static void main(String[] args) throws InterruptedException {
			
			
//			ChromeOptions co=new ChromeOptions();
//			co.addArguments("--disable-notifications");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.demo.guru99.com/v1/index.php");//load the url
			
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@name='btnLogin']")).click();
			Alert a=driver.switchTo().alert();
			System.out.println(a.getText());
			a.accept();
			
		}
	}