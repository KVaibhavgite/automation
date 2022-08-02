package screenshots;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class new01 {
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. Start the session
       // System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		//WebDriver driver=new ChromeDriver();
		//System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
		//WebDriver driver=new FirefoxDriver();
		System.setProperty("webdriver.edge.driver","./drivers/msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
        //2. Take action on browser
        driver.get("https://google.com");
        // 3. Request browser information
        String title = driver.getTitle();
        //4. Establish Waiting Strategy
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
        //5. Find an element
        WebElement searchBox = driver.findElement(By.name("q"));
        WebElement searchButton = driver.findElement(By.name("btnK"));
        //6. Take action on element
        searchBox.sendKeys("raja rani chi g jodi");
        searchButton.click();
        //7. Request element information
        String value = searchBox.getAttribute("value");
        //
        
		  

	}

}
