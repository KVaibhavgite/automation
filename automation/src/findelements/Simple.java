package com.findelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Simple{
	
	
	static {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	}
	
	
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		
		driver.get("file:///C:/Users/HP/Desktop/simple.html");
		
		
		Thread.sleep(2000);
		
		WebElement b1=driver.findElement(By.id("b"));
		
		Select s=new Select(b1);
		List<WebElement>num=s.getOptions();
		if(s.isMultiple()) {
			for(WebElement nums:num)
			{
				s.selectByValue(nums.getText());
				System.out.println(nums.getText());
			}
		}
				
				List<WebElement>opt=s.getAllSelectedOptions();
				for(WebElement opts:opt)
				{
					System.out.println(opts.getText());
				}
				System.out.println(s.getFirstSelectedOption().getText());
				s.deselectAll();
				
			}
		
		
		
		
	
}