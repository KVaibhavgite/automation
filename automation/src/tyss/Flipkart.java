
package tyss;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart{
	
	
	static {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	}
	
	
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.flipkart.com/?semcmpid=sem_F1167BY7_Brand_adcenter&s_kwcid=AL!739!10!76347407622727!76347484024120&ef_id=XVAkYQAAFTFjd_fW:20191010183014:s&affid=vignesh30");	
		Thread.sleep(2000);
		driver.findElement(By.id("i0116")).sendKeys("sawantsuraj743@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("idSIButton9")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("passwd")).sendKeys("123456");
		Thread.sleep(2000);
		driver.findElement(By.id("idSIButton9")).click();
		Thread.sleep(2000);
			
		
	}
}
