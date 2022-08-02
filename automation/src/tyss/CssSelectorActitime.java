package tyss;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorActitime {
	
	static {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	}
	

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/HP/Desktop/actitime.html");
		driver.findElement(By.cssSelector("a[id='d1']")).click();
		driver.navigate().back();
		
		driver.findElement(By.cssSelector("a[name='n1']")).click();
		driver.navigate().back();
		
		
		driver.findElement(By.cssSelector("a[class='c1']")).click();
		driver.navigate().back();
		
		driver.findElement(By.cssSelector("a[href='http://laptop-smc8hiai/login.do/']")).click();
		driver.close();

	}

}

