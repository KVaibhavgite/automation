package com.string;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class String16 {

	public static void main(String[] args) {
		
		String reverse="";
		System.out.println("Enter a string ");
		
		Scanner str=new Scanner(System.in);
		String string =str.nextLine();
		char[] charArray = string.toCharArray();
		int count=0;
		

		
		ArrayList<Character>jerryResult=new ArrayList<>();
		
	
		
	System.out.println(charArray);
	
		
	HashSet<Character>jerry1=new HashSet<>();
	for(int i=0;i<string.length();i++)
	{
		char new2= string.charAt(i);
		jerry1.add(new2);
		
		
	}

	
	for(int p=0;p<string.length();p++)
	{
		if(jerry1.contains(charArray[p])==false)
		{
			System.out.println(charArray[p]);
		}
		
		
	}

	
	 
	
	
 	
	
	
	
	
	
	
	
}
}
