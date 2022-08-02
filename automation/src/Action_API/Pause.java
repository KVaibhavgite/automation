package Action_API;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Pause {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		
		driver.get("https://www.selenium.dev/selenium/web/mouse_interaction.html");

        long start = System.currentTimeMillis();

        WebElement clickable = driver.findElement(By.id("clickable"));
        new Actions(driver)
                .moveToElement(clickable)
                .pause(Duration.ofSeconds(1))
                .clickAndHold()
                .pause(Duration.ofSeconds(1))
                .sendKeys("abc")
                .perform();

        long duration = System.currentTimeMillis() - start;
        Assertions.assertTrue(duration > 2000);
        Assertions.assertTrue(duration < 3000);
        
        driver.close();

	}

}
