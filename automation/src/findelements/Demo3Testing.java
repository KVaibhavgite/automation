package com.findelements;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo3Testing {
	
	@Test(groups="smoke",dependsOnMethods="Demo2")
	
	public void Demo()
	{
		
		
			
		Reporter.log("hello2",true);
		
	}
	
@Test(dependsOnGroups="smoke")
	
	public void Demo1()
	{
	Reporter.log("hello",true);
		
	}

@Test(groups="smoke")

public void Demo2()
{
	Reporter.log("hello1",true);
	
	
	
}
}



