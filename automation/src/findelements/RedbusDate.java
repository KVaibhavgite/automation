
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

	public class RedbusDate{

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
			
			
			month=(driver.findElement(By.xpath("//div[@class=\"rb-calendar\"]/table/tbody/tr[1]/td[2]")).getText());
			
			j=month.length();
			
			int i=1997;
			
			
			
		
			switch (month) {
			
			case "Jan ":
				String substring1=month.substring(0,4);
				break;
				
			case "Feb ":
				String substring2=month.substring(0,4);
				break;
				
			case "Mar ":
				String substring3=month.substring(0,4);
				break;
				
			case "Apr ":
				String substring4=month.substring(0,4);
				break;
				
			case "May ":
				String substring5=month.substring(0,4);
				break;
				
			case "Jun ":
				String substring6=month.substring(0,4);
				break;
				
			case "July ":
				String substring7=month.substring(0,5);
				break;
				
			case "Aug ":
				String substring8=month.substring(0,4);
				break;
				
			case "Sept ":
				String substring9=month.substring(0,5);
				break;
				
			case "Oct ":
				String substring10=month.substring(0,4);
				break;
				
			case "Nov ":
				String substring11=month.substring(0,4);
				break;
				
				
			case "Dec ":
				String substring12=month.substring(0,4);
				break;
				
			default:
				break;
			}
		}
	
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			driver.findElement(By.xpath("//div[@class=\"rb-calendar\"]/table/tbody/tr[1]/td[3]")).click();
			
			//div[@class="rb-calendar"]/table/tbody/tr[1]/td[2]
			
			
			
			
			

			// open the tab with keyboard
//
//			Robot r = new Robot();
//			r.keyPress(KeyEvent.VK_CONTROL);
//			r.keyPress(KeyEvent.VK_C);
//			r.keyRelease(KeyEvent.VK_C);
//			r.keyRelease(KeyEvent.VK_CONTROL);
//			Thread.sleep(3000);
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		
			
			
		}
	}
	