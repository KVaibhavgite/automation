package wedriverLocaters;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class facebook {

	public static void main(String[] args) throws InterruptedException {
		boolean logintrue=true;
		//provide the path for driver
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		//lunching the browser
		WebDriver driver=new ChromeDriver();
		//browser window maximize
		/*driver.manage().window().maximize();
		//provides the website url
		driver.get("https://www.facebook.com/");
		// Implicit  wait to the wait for browser
		 driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
		 //input provides
		driver.findElement(By.cssSelector("input#email")).sendKeys("4655496656");
		driver.findElement(By.cssSelector("#pass")).sendKeys("passward");
		driver.findElement(By.cssSelector("button[name=login]")).click();
		
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().refresh();
		 driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
		
		//create facebook account
		driver.findElement(By.linkText("Create New Account")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("#u_4_b_Ux")).sendKeys("vaibhav");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='u_7_d_SF']")).sendKeys("gite");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("//input[@id='u_7_g_kM']")).sendKeys("9767240176");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("//input[@id='password_step_input']")).sendKeys("Passward@01");
		Thread.sleep(2000);
		Select day=new Select(driver.findElement(By.cssSelector("//select[@id='day']")));
		day.selectByVisibleText("16");
		Thread.sleep(2000);
		
		Select month=new Select(driver.findElement(By.cssSelector("//select[@id='month']")));
		month.selectByVisibleText("11");
		Thread.sleep(2000);
		
		Select year=new Select(driver.findElement(By.cssSelector("//select[@id='month']")));
		year.selectByVisibleText("1997");
		Thread.sleep(2000);
		
		 WebElement radio1 = driver.findElement(By.xpath("//label[@for='u_4_4_wW']"));							
	        WebElement radio2 = driver.findElement(By.xpath("//label[@for='u_4_5_Cx']"));							
	        		
	        //Radio Button1 is selected		
	      //  radio1.click();			
	      //  System.out.println("Radio Button Option 1 Selected");					
	        		
	        //Radio Button1 is de-selected and Radio Button2 is selected		
	        radio2.click();			
	        System.out.println("Radio Button Option 2 Selected");					
	        		*/
		
		   
	    


	}

}
