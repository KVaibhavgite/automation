package com.findelements;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(ListDemo.class)
public class DdemoListimpClass {
	
	
	@Test
	public void test1() {
		System.out.println("Suraj Sawant1");
	}

	
	@Test
	public void test2() {
		System.out.println("Suraj Sawant2");
		Assert.fail();
	}
	
}
