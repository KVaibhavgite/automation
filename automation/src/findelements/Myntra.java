
package com.findelements;
	import java.util.List;
	import org.openqa.selenium.By;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;

	public class Myntra{

		static {
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		}

		public static void main(String[] args) throws InterruptedException {
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.myntra.com");//load the url
			Thread.sleep(10000);
			
//			driver.findElement(By.xpath("//div[@class='desktop-navLink']")).click();
//			Thread.sleep(3000);
//			
			
		    List<WebElement> menu = driver.findElements(By.xpath("//div[@class='desktop-navLink']"));
		    Actions a=new Actions(driver);
			Thread.sleep(4000);
			
			for(WebElement name:menu)
				{		
					String menuName=name.getText();//to get the header text
					System.err.println(menuName);//to get the headers in red color like error
					a.moveToElement(name).build().perform();//to mouse over
					Thread.sleep(1000);
					
					
					List<WebElement> subMenu = driver.findElements(By.xpath("//div[contains(.,'"+menuName+"')]/parent::div/descendant::div[@class='desktop-paneContent']/div/li/ul/li"));
					//for getting the submenus of different menu like concatination
					Thread.sleep(3000);
					
					
					for(WebElement item:subMenu)
					{
						System.out.println(item.getText());//display the submenus
					}
				}
		}
	}
					
					
					
	//a[contains(.,'Men')]/ancestor::div[@class='desktop-navLinks']/descendant::div[@class='desktop-categoryContainer']/li