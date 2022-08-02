package com.findelements;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class Hub {

	@Test
	
	public void  testA()throws MalformedURLException
	{
		URL node=new URL("https://192.168.43.182:4445/wd/node");
		DesiredCapabilities browser=new DesiredCapabilities();
		browser.setBrowserName("firefox");
		WebDriver driver=new RemoteWebDriver(node,browser);
		driver.get("https://www.google.com");
	}
}
