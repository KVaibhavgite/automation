package tyss;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathAbsolute {
	
	static {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	}
	

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/HP/Desktop/actitime.html");
		driver.findElement(By.xpath("./html/body/a")).click();

	}

}
