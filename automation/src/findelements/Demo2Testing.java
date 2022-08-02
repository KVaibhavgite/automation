package com.findelements;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo2Testing {
	
	@Test(priority=1)
	
	public void Demo()
	{
		
		
			
		Reporter.log("hello",false);
		
	}
	
@Test(invocationCount=0,priority=-2)
	
	public void Demo1()
	{
		System.out.println("hi");
		
	}
	
	
	
}



