package tyss;

import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.remote.RemoteWebDriver;

public class Demo {
	static
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	}

	public static void main(String[] args) {
		// Open the browser
		
		ChromeDriver driver=new ChromeDriver();
		
		
		
		
		//Enter the URL
		driver.get("http://laptop-smc8hiai/login.do");
		String title=driver.getTitle();
		
		//Getting the title & printing it on the console
		System.out.println(title);
		
		//Close the browser
		driver.close();
	}

}
