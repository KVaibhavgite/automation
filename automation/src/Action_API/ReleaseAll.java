package Action_API;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class ReleaseAll {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		
		driver.get("https://www.selenium.dev/selenium/web/mouse_interaction.html");

        WebElement clickable = driver.findElement(By.id("clickable"));
        Actions actions = new Actions(driver);
        actions.clickAndHold(clickable)
                .keyDown(Keys.SHIFT)
                .keyDown(Keys.ALT)
                .sendKeys("a")
                .perform();

        ((RemoteWebDriver) driver).resetInputState();

        actions.sendKeys("a").perform();
        Assertions.assertEquals("Å", String.valueOf(clickable.getAttribute("value").charAt(0)));
        Assertions.assertEquals("a", String.valueOf(clickable.getAttribute("value").charAt(1)));
        
        driver.close();

	}

}
