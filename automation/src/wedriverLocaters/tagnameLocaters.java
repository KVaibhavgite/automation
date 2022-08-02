package wedriverLocaters;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class tagnameLocaters {

	
	
	    public static void main(String[] args) throws InterruptedException {
	        // TODO Auto-generated method stub
	        
	        //Setting up chrome using chromedriver by setting its property
	    	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			
	                //Opening browser
	                WebDriver driver= new ChromeDriver() ;
	                
	                //Opening window tab in maximize mode
	                driver.manage().window().maximize();
	                
	                //Opening application
	                driver.get("https://accounts.lambdatest.com/login");
	                
	                //Locating the email field element via Name tag and storing it in the webelement
	                WebElement email_field=driver.findElement(By.name("email"));
	                
	                //Entering text into the email field
	                email_field.sendKeys("sadhvisingh24@gmail.com");
	                
	                //Locating the password field element via Name tag and storing it in the webelement
	                WebElement password_field=driver.findElement(By.name("password"));
	                        
	                //Entering text into the password field
	                password_field.sendKeys("New1life");
	                
	                //Clicking on the login button to login to the application
	                WebElement login_button=driver.findElement(By.xpath("//button[text()='LOGIN']"));
	                
	                //Clicking on the 'login' button
	                login_button.click();
	                
	               //Clicking on the Settings option
	                driver.findElement(By.xpath("//*[@id='app']/header/aside/ul/li[8]/a")).click();
	                
	                //Waiting for the profile option to appear
	                Thread.sleep(3500);
	                
	                //*[@id="app"]/header/aside/ul/li[8]/ul/li[1]/a
	                //Clicking on the profile link
	                driver.findElement(By.xpath("//*[@id='app']/header/aside/ul/li[8]/ul/li[1]/a")).click();
	                
	                //Locating the element via img tag for the profile picture and storing it in the webelement
	                WebElement image= driver.findElement(By.tagName("img"));
	                
	                //Printing text of Image alt attribute which is sadhvi
	                System.out.println(image.getAttribute("alt"));

	    }

	

}
