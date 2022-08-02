package dataDrivenFramework;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class ActiTimeValidLogin {
	
	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		driver.get("http://laptop-hje754g6/login.do");
		
		Flib flib = new Flib();
		String username = flib.readExcelData("./data/TestData.xlsx", "validcreds", 1, 0);
		String password = flib.readExcelData("./data/TestData.xlsx", "validcreds", 1, 1);
		
		
		driver.findElement(By.name("username")).sendKeys(username);
		
		driver.findElement(By.name("pwd")).sendKeys(password);
		
		driver.findElement(By.id("loginButton")).click();
		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(3));
		
		wait.until(ExpectedConditions.titleContains("Enter"));
		
		flib.writeExcelData("./data/TestData.xlsx", "validcreds", 1, 2, "pass");
	
		
		
	}

}
