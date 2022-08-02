package com.string;

import java.util.Scanner;

public class String4 {

	public static void main(String[] args) {
		
		
		String reverse1="";
		System.out.println("Enter a string you want to reverse");
		
		Scanner str=new Scanner(System.in);
		String string =str.nextLine();
		String word=string;
		
		for(int i=(string.length()-1);i>=0;i--)
		{
			reverse1=reverse1+string.charAt(i);
			break;
		}
		
		
		
		
		String reverse=reverse1;
		
		
		for(int i=0;i<string.length()-1;i++)
		{
			reverse=reverse+string.charAt(i);
		}
	
		
		System.out.println(reverse);
		
		
}
		
		
	

	
}
