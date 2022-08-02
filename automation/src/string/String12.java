package com.string;

import java.util.Scanner;

public class String12 {

	public static void main(String[] args) {
		
		String new1="";
		System.out.println("Enter a string to got the spaces eliminated");
		
		Scanner str=new Scanner(System.in);
		String string =str.nextLine();
		String word=string;
		
		
		for(int i=0;i<=string.length()-1;i++)
		{
			if(string.charAt(i)!=' ') {
				new1=new1+string.charAt(i);
			}
			else
			{
				continue;
			}
		}
		
		System.out.println(new1);
		
		
	
		
	}

	
}
