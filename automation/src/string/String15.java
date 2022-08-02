package com.string;

import java.util.Scanner;

public class String15 {

	public static void main(String[] args) {
		
		String reverse="";
		System.out.println("Enter brackets");
		
		Scanner str=new Scanner(System.in);
		String string =str.nextLine();
		String word=string;
		
		char c=(char)40;
		char c1=(char)41;
		for(int i=0;i<=string.length()-1;i++)
		{
			for(int j=0;j<=string.length()-1;j++) {
			
			if(string.charAt(i)==c  && string.charAt(j)==c1)
			{
				break;
			}
			else
			{
				System.out.println("not balanced");
			}
			}
		}
			
			
			
		}
		
		
		
	

	
	}

