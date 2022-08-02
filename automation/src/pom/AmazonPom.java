package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonPom {
	@FindBy(id="twotabsearchtextbox")
	private WebElement search;
	
	@FindBy(className="nav-input")
	private WebElement go;
	
	@FindBy(id="pdagDesktopSparkleAsinsContainer")
	private WebElement click1;
	
	@FindBy(id="add-to-cart-button")
	private WebElement click2;
	
	@FindBy(id="nav-logo")
	private WebElement click3;
	
	@FindBy(xpath="//span[text()='OnePlus 7 (Mirror Grey, 6GB RAM, Optic AMOLED Display, 128GB Storage, 3700mAH Battery)']")
	private WebElement click4;
			
			
			
	public AmazonPom(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void sendText(String text) {
		search.sendKeys(text);
		
	}
	
	public void goClick() {
		go.click();
		
	}
	
	public void mobileClick() {
		click1.click();
		
	}
	

	public void addToCart() {
		click2.click();
		
	}
	
	public void logoClick() {
		click3.click();
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
