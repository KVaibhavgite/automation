package com.string;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class String11B{

	public static void main(String[] args) {
System.out.println("Enter a string you want to reverse");
		
		Scanner str=new Scanner(System.in);
		String s =str.nextLine();
		int count=0;
		
		for(int i=0;i<s.length();i++)
		{
			char new1= s.charAt(i);
			
			for(int k=0;k<s.length();k++)
			{
				if(new1==s.charAt(k))
				{
					count++;
				}
				
			}
			System.out.println(new1+"  is repeated "+(count-1)+" times");
			count=0;
		}
		
		
		

		
		
	}
}
