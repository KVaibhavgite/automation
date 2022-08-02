package com.pom;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Gmail{
	@FindBy(id="identifierId")
	private WebElement username;
	
	@FindBy(name="password")
	private WebElement password;
	
	@FindBy(xpath="//span[@class='CwaK9']/span[text()='Next']")
	private WebElement next;
	
			
			
	public Gmail(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void sendText(String text) {
		username.sendKeys(text);
		
	}
	

	public void sendText1(String text) {
		password.sendKeys(text);
		
	
	}
	
	public void click() {
		next.click();
		
	
	}
	
	
	
	
	
	
	
	
	
	

}
