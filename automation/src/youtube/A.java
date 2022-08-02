package youtube;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/");
		//Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"search\"]")).sendKeys("hfj");
		//driver.findElement(By.xpath("//*[@id=\"search-icon-legacy\"]/yt-icon")).click();
		driver.close();

	}

}
