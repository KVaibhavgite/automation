package tyss;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo0 {
	static {
		System.setProperty("webdriver.chrome.driver"," ./drivers/chromedriver.exe");
		
		//System.setProperty("webdriver.gecko.driver"," ./drivers/geckodriver.exe");
			}
	
	public static void main(String[] args) throws Exception {
		WebDriver driver1=new ChromeDriver();
		//DemoE.test(driver1);
		//WebDriver driver2=new FirefoxDriver();
		//Demoe.test(driver2);
	}

}
