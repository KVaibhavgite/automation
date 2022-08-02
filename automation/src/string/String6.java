package com.string;

import java.util.Scanner;

public class String6 {

	public static void main(String[] args) {
		
		String reverse="";
		String reverse1="";
		System.out.println("Enter a string you want to reverse");
		
		Scanner str=new Scanner(System.in);
		String string =str.nextLine();
		String word=string;
		int count=0;
		
		
		for(int i=0;i<string.length();i++)
		{
//			for(int j=97;j<=122;j++) {
		
			if(string.charAt(i)!=' ')
			{
				count++;
			}
				
			}
		
			System.out.println(count);
				
				
//			}
//			else
//			{
//				break;
//			}
//			
//		}
//		
//		System.out.println(count+1);
//		
		
		
		
	}

	
}
