package youtube;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class facebook {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	    WebDriver driver = new ChromeDriver();

	    driver.get("https://www.facebook.com/");
	    driver.manage().window().maximize();

	    //text fields
	    driver.findElement(By.id("u_0_j")).sendKeys("sruthi");
	    driver.findElement(By.name("lastname")).sendKeys("karpuram");
	    driver.findElement(By.name("reg_email__")).sendKeys("84521636866");
	    driver.findElement(By.name("reg_passwd__")).sendKeys("il9HNJ1234");

	    //static drop down
	    Select s = new Select(driver.findElement(By.id("day")));
	    Thread.sleep(1000);
	    s.selectByVisibleText("12");

	    Select s1 = new Select(driver.findElement(By.id("month")));
	    Thread.sleep(1000);
	    s1.selectByValue("5");

	    Select s2 = new Select(driver.findElement(By.id("year")));
	    Thread.sleep(1000);
	    s2.selectByValue("1993");
	    //radio button
	        driver.findElement(By.xpath("//input[@value='2']")).click();//for selecting male

	    driver.findElement(By.name("websubmit")).click();

	    driver.close();


	}

}
