package tyss;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiveElement1{
	
	
	static {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	}
	
	
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://localhost/login.do");
		
	String AttributeValue=driver.findElement(By.xpath("//input[@name='username']")).getAttribute("class");
	System.out.println(AttributeValue);
	String cssValue=driver.findElement(By.xpath("//a[text()='Login']")).getCssValue("color");
	
	System.out.println(cssValue);
	
	String FontFamily=driver.findElement(By.xpath("//a[text()='Login']")).getCssValue("font-family");
	System.out.println(FontFamily);
	driver.quit();
	
	
	}
}
