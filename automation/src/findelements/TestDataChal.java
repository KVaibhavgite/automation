package com.findelements;

import java.util.Scanner;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestDataChal {
	static int x;
	Scanner scanner=new Scanner(System.in);
//	System.out.println("Enter 1 if you want column username");
//	System.out.println("Enter 2 if you want column pass");
//	System.out.println("Enter 3 if you want column input");

	int choicee=scanner.nextInt()
	x=choicee;
	@Test(dataProviderClass=ExcelRead.class,dataProvider="createUser1")
	public void test(String user,String pass,String input)
	{
		

switch (x) {
case 1:	Reporter.log(user, true);
	
	break;
	
case 2: Reporter.log(pass, true);
	
	break;

	
case 3:Reporter.log(input, true);

	break;


default:
	System.out.println("Enter a valid choice");
	break;
}
	}
	}













































//package com.findelements;
//
//import java.util.Scanner;
//
//import org.testng.Reporter;
//import org.testng.annotations.Test;
//
//public class TestDataChal {
//	@Test(dataProviderClass=ExcelRead.class,dataProvider="createUser1")
//	public void test(String user,String pass,String input)
//	{
//		if(1==ExcelRead.x)
//		{
//			Reporter.log(user,true);
//		}
//		else if(2==ExcelRead.x)
//		{
//			Reporter.log(pass,true);
//		}
//		else if(3==ExcelRead.x)
//		{
//			Reporter.log(input,true);
//		}
//		else
//		{
////			System.out.println("Enter a valid choice");
//		}
//		
//	}
//}

