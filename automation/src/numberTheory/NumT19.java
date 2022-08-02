package co.numberTheory;

import java.util.Scanner;

public class NumT19 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a three digit number " );
		int a=sc.nextInt();
		int unit=0;
		int sum=0;
		
       int count=0;
		int x=a;
		int g=x;
		int ele=0;
		int ele2=0;
		while(a!=0)
		{
			a=a/10;
			count++;
		}
		System.err.println(count);
	
		while(count==3 && x!=0)
		{
			unit=x%10;
			x=x/10;
			break;
		}
		int surajlastSum=unit;
		System.out.println(unit+"last");
		//
		while(x!=0)
		{
			unit=x%10;
			ele=unit;
			x=x/10;
			break;
		}
		System.out.println(ele);
		
		while(x!=0)
		{
			unit=x%10;
			ele2=unit;
			x=x/10;
			break;
		}
		
		int done=ele+ele2;
		
		System.out.println(done);
		
		if(done==surajlastSum)
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		


	
	}}
