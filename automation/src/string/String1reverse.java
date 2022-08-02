package com.string;

import java.util.Scanner;

public class String1reverse {

	public static void main(String[] args) {
		
		String reverse="";
		String reverse1="";
		System.out.println("Enter a string you want to reverse");
		
		Scanner str=new Scanner(System.in);
		String string =str.nextLine();
		String word=string;
		
		
		for(int i=(string.length()-1)/2;i>=0;i--)
		{
			reverse=reverse+string.charAt(i);
		}
		
		
		for(int j=(string.length()-1);j>=(string.length())/2;j--)
		{
			reverse1=reverse1+string.charAt(j);
		}
		
		//System.out.println(reverse+reverse1);
		
		System.out.println("first half : "+reverse);
		System.out.println("second half : "+reverse1);
		
		if(reverse==word)
		
			System.out.println("palindrome string");
	
		//(string.length()+4)/2
		
		else
		
			System.out.println("Not a palindrome string");
		
	}

	
}
