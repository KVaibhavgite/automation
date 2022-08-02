package tyss;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxAlign {
	
	static {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	}
	
	
	public static void main(String[] args)throws InterruptedException{
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("file:///C:/Users/HP/Desktop/sample1.html");
		
		//to get the alignment of username and pwd field
		int checkBox1=driver.findElement(By.xpath("//input[@checked]")).getLocation().getY();
		int checkBox2=driver.findElement(By.xpath("(//input[@type='checkbox'])[2]")).getLocation().getY();
		
		
		
		System.out.println(checkBox1);
		System.out.println(checkBox2);
		
		if(checkBox1==checkBox2)
			System.out.println("both are same so test case is PASS");
		else
			System.out.println("FAIL");
	
		driver.close();
	}

}
