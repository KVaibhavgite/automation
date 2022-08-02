package com.findelements;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class Node1 {
	@Test
	public void node1() throws MalformedURLException {
		URL node = new URL("http://192.168.43.96:1000/wd/node1");
		DesiredCapabilities browser = new DesiredCapabilities();
		browser.setBrowserName("chrome");
		WebDriver driver = new RemoteWebDriver(node, browser);
		driver.get("https://www.google.com");

	}
}
