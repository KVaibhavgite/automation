package youtube;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.asm.Advice.Enter;

public class A01 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.get("https://www.wonderplugin.com/wordpress-lightbox");

		WebElement element=driver.findElement(By.xpath("//a[contains(text(),'Open a Div in Lightbox')]"));

		element.click();

		WebElement frameElement=driver.findElement(By.xpath("//iframe[@src='https://www.youtube.com/embed/wswxQ3mhwqQ']"));

		        driver.switchTo().frame(frameElement);

		        driver.findElement(By.xpath("//button[@aria-label=\'Play\']")).click();
		driver.close();

	}

}
