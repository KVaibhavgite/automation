package tyss;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Skype{
	
	
	static {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	}
	
	
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://login.live.com/login.srf?wa=wsignin1.0&rpsnv=13&ct=1570732251&rver=7.1.6819.0&wp=MBI_SSL&wreply=https%3A%2F%2Flw.skype.com%2Flogin%2Foauth%2Fproxy%3Fclient_id%3D572381%26redirect_uri%3Dhttps%253A%252F%252Fweb.skype.com%252FAuth%252FPostHandler%26state%3Dd0cc5e58-c952-4046-b75c-c20d7cc7cb29%26site_name%3Dlw.skype.com&lc=1033&id=293290&mkt=en-US&psi=skype&lw=1&cobrandid=2befc4b5-19e3-46e8-8347-77317a16a5a5&client_flight=ReservedFlight33%2CReservedFlight67");
		
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
