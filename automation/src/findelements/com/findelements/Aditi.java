
package com.findelements;
	import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

	import org.openqa.selenium.Alert;
	import org.openqa.selenium.By;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.chrome.ChromeOptions;
	import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

	public class Aditi{

		static {
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		}

		public static void main(String[] args) throws InterruptedException,AWTException {
			int j=0;
			
			ChromeOptions co=new ChromeOptions();
			co.addArguments("--disable-notifications");
			WebDriver driver = new ChromeDriver(co);
			driver.manage().window().maximize();
			driver.get("https://www.redbus.in/");//load the url
			
			Thread.sleep(2000);
			
			driver.findElement(By.id("src")).sendKeys("Bangalore");
			
			Thread.sleep(2000);
		
			driver.findElement(By.xpath("//section[@id='search']/descendant::ul[1]")).click();
			Thread.sleep(3000);
	
			driver.findElement(By.id("dest")).sendKeys("Goa");
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//section[@id='search']/div/descendant::ul[1]")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.id("onward_cal")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//div[@class='rb-calendar']/table/descendant::tr[5]/td[5]")).click();
			Thread.sleep(3000);
			
			
			//div[@class='kno-ecr-pt kno-fb-ctx PZPZlf gsmt']/span
			WebElement doubleT = driver.findElement(By.xpath("//div[@class=\"rb-calendar\"]/table/tbody/tr[1]/td[2]"));
			Actions a = new Actions(driver);
			a.doubleClick(doubleT).perform();
			
			Robot r=new Robot();
			r.keyPress(KeyEvent.VK_CONTROL);
			r.keyPress(KeyEvent.VK_C);
			
			String someKeyCode=KeyEvent.getKeyText(67);
			
			r.keyRelease(KeyEvent.VK_C);
			r.keyRelease(KeyEvent.VK_CONTROL);
			Thread.sleep(3000);
			
			String month=someKeyCode;
			
			
//			month=(driver.findElement(By.xpath("//div[@class=\"rb-calendar\"]/table/tbody/tr[1]/td[2]")).getText());
			
//			j=month.length();
			
			int i=1997;
			
			int f=0;
			
			String king="Dec ";
			
		
			switch (king) {
			
			case "Jan ":
				 f=1;
				
				break;
				
			case "Feb ":
				f=2;
				
				break;
				
			case "Mar ":
				f=3;
				
				break;
				
			case "Apr ":
				f=4;;
				
				break;
				
			case "May ":
				f=5;
				
				break;
				
			case "Jun ":
				f=6;
				break;
				
			case "July ":
				f=7;
				break;
				
			case "Aug ":
				f=8;
				break;
				
			case "Sept ":
				f=9;
				break;
				
			case "Oct ":
				f=10;
				break;
				
			case "Nov ":
				f=11;
				break;
				
				
			case "Dec ":
				f=3;
				break;
				
			default:
				break;
			}

		
			
			
			
		for(int k=1;i<=f;k++)
		{
			driver.findElement(By.xpath("//div[@class=\"rb-calendar\"]/descendant::td[3]")).click();
			Thread.sleep(2000);
		}
			
			
			
//			
//			
//			driver.findElement(By.xpath("//div[@class=\"rb-calendar\"]/table/tbody/tr[1]/td[3]")).click();
//			
//			//div[@class="rb-calendar"]/table/tbody/tr[1]/td[2]
//			
			
			

			
			
			
		}
	}
	