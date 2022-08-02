package tyss;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {
	
	static {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	}
	

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/HP/Desktop/doc12345.html");
		driver.findElement(By.cssSelector("a[id='d1']")).click();
		driver.navigate().back();
		
		driver.findElement(By.cssSelector("a[name='n1']")).click();
		driver.navigate().back();
		
		
		driver.findElement(By.cssSelector("a[class='c1']")).click();
		driver.navigate().back();
		
		driver.findElement(By.cssSelector("a[href='http://www.jspiders.com/']")).click();
		driver.close();

	}

}
