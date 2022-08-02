package com.findelements;

import java.util.Scanner;

import org.testng.Reporter;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestDataChal1 {
	static int x;
	
	
	@BeforeMethod
	
	public void inputUser()
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter 1 if you want column username");
		System.out.println("Enter 2 if you want column pass");
		System.out.println("Enter 3 if you want column input");
		int choicee=scanner.nextInt();
		x=choicee;
	}
	
	@Test(dataProviderClass=ExcelRead1.class,dataProvider="createUser1")
	public void test0(String user)
	{
		Reporter.log(user,true);
	}
	@Test(dataProviderClass=ExcelRead1.class,dataProvider="createUser2")
	public void test1(String pass)
	{
		Reporter.log(pass,true);
	}
	@Test(dataProviderClass=ExcelRead1.class,dataProvider="createUser3")
	public void test2(String input)
	{
		Reporter.log(input,true);
	}


	public void main1(int x)
	{
	switch (x) {
	case 1:	test0("user");
		
		break;
		
	case 2: test1("passs");
		
		break;

		
	case 3:test2("input");

		break;
		default:System.out.println("Enter valid");
	
	}
	}

}