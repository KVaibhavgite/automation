package com.string;

import java.util.Scanner;

public class String5 {
	
	public static void main(String[] args) {
		
System.out.println("Enter a string you want to reverse");
		
		Scanner str=new Scanner(System.in);
		String string =str.nextLine();
		int i=0;
		for(char s :string.toCharArray())
		{
			i++;
		}
		System.out.println("Length of given String is : "+ i);
	}
}
