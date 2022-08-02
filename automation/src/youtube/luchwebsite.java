package youtube;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class luchwebsite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")).sendKeys("salesforce");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[2]/div[2]/div[5]/center/input[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div[1]/div/div/div[1]/div/a/h3")).click();
	    driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div[2]/ul/li[1]/div/div/div/div[1]/div/a/h3")).click();
        driver.findElement(By.xpath("//a[contains(@id,'f')]")).click();
	}

}
