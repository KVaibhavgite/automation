package tyss;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Location {
	
	static {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	}
	
	
	public static void main(String[] args)throws InterruptedException{
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("http://localhost/login.do");
		
		//to get the alignment of username and pwd field
		int unLocation=driver.findElement(By.name("username")).getLocation().getX();
		int pwdLocation =driver.findElement(By.name("pwd")).getLocation().getX();
		
		
//		int unwidth=driver.findElement(By.name("username")).getLocation().getY();
//		int pwdWidth=driver.findElement(By.name("pwd")).getLocation().getY();
		
		System.out.println(unLocation);
		System.out.println(pwdLocation);
		
		if(unLocation==pwdLocation)
			System.out.println("both are same so test case is PASS");
		else
			System.out.println("FAIL");
	
		driver.close();
	}

}