package com.testpom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.pom.Gmail;

public class TestGmail {
	WebDriver driver;
	Gmail g;

	@BeforeClass

	public void beforeC() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}

	@BeforeMethod

	public void before() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.gmail.com/");// load the url

	}

	@Test

	public void test1() {
		g = new Gmail(driver);
		g.sendText("surajraj19091997@gmail.com");
		g.click();
		g.sendText1("kolzer$1319");
		g.click();
	}

	@Test

	public void test2() {
		 g = new Gmail(driver);
		g.click();
		g.sendText("ranbir");
		g.sendText1("alia");
		g.click();
	}

	@Test

	public void test3() {
		g = new Gmail(driver);
		g.sendText("-cnwc-- ");
		g.click();
		g.sendText1("000000");
		g.click();
	}

	@Test

	public void test4() {
		g = new Gmail(driver);
		
		g.sendText("000000");
		g.click();
		g.sendText1("decn");
		g.click();
	}

	@Test
	public void test5() {
		g = new Gmail(driver);
		g.sendText("hhh");
		g.click();
		g.sendText1("  ");
		g.click();
	}

	@Test
	public void test6() {
		g = new Gmail(driver);
		g.sendText("surajraj19091997@gmail.com");
		g.click();
		g.sendText1("KOLZER");
		g.click();
	}

	@AfterMethod

	public void after() {
		driver.close();
//		WebDriverWait ww=new WebDriverWait(driver,1600000000);
//		ww.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[text()='Compose']")));
//		System.out.println("pass");
	}

}