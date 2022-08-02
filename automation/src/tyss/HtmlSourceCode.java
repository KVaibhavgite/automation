package tyss;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class HtmlSourceCode {
	
	
	static {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	}
	
	
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://localhost/login.do");
		
		String html=driver.getPageSource();
		System.out.println(html);
		driver.close();
	}

}
