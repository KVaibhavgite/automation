package KeyboardAction;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyUp {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		 driver.get("https://www.selenium.dev/selenium/web/single_text_input.html");

		 new Actions(driver)
         .keyDown(Keys.SHIFT)
         .sendKeys("a")
         .keyUp(Keys.SHIFT)
         .sendKeys("b")
         .perform();

	        WebElement textField = driver.findElement(By.id("textInput"));
	        Assertions.assertEquals("Ab", textField.getAttribute("value"));
	        driver.close();


	}

}
