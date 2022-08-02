package Action_API;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class PauseAllAction {

	public static void main(String[] args) {
		//Pause-Pointer movements and Wheel scrolling allow the user to set a duration
		//      for the action, but sometimes you just need to wait a beat between actions for things to work correctly.
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		
		driver.get("https://www.selenium.dev/selenium/web/mouse_interaction.html");

        long start = System.currentTimeMillis();
        
        //Pause methods
        WebElement clickable = driver.findElement(By.id("clickable"));
        new Actions(driver)
                .moveToElement(clickable)
                .pause(Duration.ofSeconds(1))
                .clickAndHold()
                .pause(Duration.ofSeconds(1))
                .sendKeys("abc")
                .perform();
        
        //Release All Actions-
        ((RemoteWebDriver) driver).resetInputState();
        
        driver.close();


	}

}
