package tyss;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Size {
	
	static {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	}
	
	
	public static void main(String[] args)throws InterruptedException{
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("http://localhost/login.do");
		int unHeight=driver.findElement(By.name("username")).getSize().getHeight();
		int pwdHeight=driver.findElement(By.name("pwd")).getSize().getHeight();
		
		
		int unwidth=driver.findElement(By.name("username")).getSize().getWidth();
		int pwdWidth=driver.findElement(By.name("pwd")).getSize().getWidth();
		
		
		if(unHeight==pwdHeight && unwidth==pwdWidth) 
		{
			System.out.println(" Height and width of both textbox are same respectively");
			System.out.println(unHeight);
			System.out.println(unwidth);
			
			
		}
			
			else {
			
				System.out.println("not same");
				 }
		driver.close();
	}

}
