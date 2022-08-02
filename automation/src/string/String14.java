package com.string;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class String14{

	public static void main(String[] args) {
System.out.println("Enter first string : ");
		
		Scanner str=new Scanner(System.in);
		String s =str.nextLine();
		
		
		System.out.println("Enter Second string : ");
		String s1 =str.nextLine();

		int count=0;
		ArrayList<Character>jerry=new ArrayList<>();
		for(int i=0;i<s.length();i++)
		{
			char new1= s.charAt(i);
			jerry.add(new1);
			
			
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
		
		
		

		int count1=0;
		ArrayList<Character>jerry1=new ArrayList<>();
		for(int i=0;i<s.length();i++)
		{
			char new1= s.charAt(i);
			jerry1.add(new1);
			for(int k=0;k<s.length();k++)
			{
				if(new1==s.charAt(k))
				{
					count++;
				}
				
			}
			System.out.println(new1+"  is repeated "+(count-1)+" times");
			count1=0;
		}
		
		int tom1=jerry.size();
		int tom2=jerry1.size();
		
		if(jerry.contains(jerry1) && tom1==tom2)
		{
			System.out.println("anagram");
		}
		else
		{
			System.out.println("not anagram");
		}
		

		
		
	}
}
