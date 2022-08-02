package wedriverLocaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tagnameLocaters01 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.financialexpress.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.className("login-button")).click();
		Thread.sleep(2000);
		driver.findElement(By.className("m-links-share")).click();
		Thread.sleep(2000);
		WebElement email_field=driver.findElement(By.id("identifierId"));
        
        //Entering text into the email field
        email_field.sendKeys("sadhvisingh24@gmail.com");
        Thread.sleep(2000);
        driver.findElement(By.className("VfPpkd-vQzf8d")).click();
        Thread.sleep(2000);
        
        //Locating the password field element via Name tag and storing it in the webelement
        WebElement password_field=driver.findElement(By.name("password"));
                
        //Entering text into the password field
        password_field.sendKeys("New1life");
		
		

	}

}
