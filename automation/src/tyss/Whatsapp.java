package tyss;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Whatsapp {
	
	static {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	}
	
	
	public static void main(String[] args)throws InterruptedException{
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://web.whatsapp.com");
		
		//to get the alignment of username and pwd field
		//int checkBox1=driver.findElement(By.xpath("//input[@checked]")).getLocation().getY();
		//int checkBox2=driver.findElement(By.xpath("(//input[@type='checkbox'])[2]")).getLocation().getY();
		
		Thread.sleep(3000);
		
	
	
		driver.close();
	}

}
