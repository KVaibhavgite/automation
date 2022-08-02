package youtube;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class flipkart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://www.flipkart.com/");
		driver.get("https://www.flipkart.com/mobiles-big-saving-days-apr22-6c7d-j4nx-store?param=19867736376343&fm=neo%2Fmerchandising&iid=M_ca300fd3-60ca-4683-acec-7d6824bcd797_1_VCLRDDAFO0B3_MC.AIDH8F3BCTJQ&otracker=hp_rich_navigation_1_1.navigationCard.RICH_NAVIGATION_Mobiles_AIDH8F3BCTJQ&otracker1=hp_rich_navigation_PINNED_neo%2Fmerchandising_NA_NAV_EXPANDABLE_navigationCard_cc_1_L0_view-all&cid=AIDH8F3BCTJQ");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("window.scrollBy(0,1000)", "");
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//header line all the icon highlight
		//String [] header= {"//*[@id=\"container\"]/div/div[2]/div/div/div[1]/a/div[1]/div/img","//*[@id=\"container\"]/div/div[2]/div/div/div[2]/a/div[1]/div/img"};
		//for(int i=0;i<=header.length;i++) 
		//{
			//driver.findElement(By.xpath("//*[@id=\\\"container\\\"]/div/div[2]/div/div/div[1]/a/div[1]/div/img")).click();
		//	
			
		//}
		//driver.close();

	}

}
