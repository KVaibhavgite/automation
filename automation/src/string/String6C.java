package com.string;

import java.util.Scanner;

public class String6C {

	public static void main(String[] args) {
		
		String reverse="";
		String reverse1="";
		System.out.println("Enter a string you want to reverse");
		
		Scanner str=new Scanner(System.in);
		String string =str.nextLine();
		String word=string;
		int count=0;
		
		char ch[]=new char[string.length()];
		for(int i=0;i<string.length();i++)
		{

			ch[i]=string.charAt(i);
			if(ch[i]==' ')
			{
				count++;
			}
				
		}
			count=count+1;
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
