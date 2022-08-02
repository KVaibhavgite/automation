package com.string;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class String10{

	public static void main(String[] args) {
		String s="surajaan";
		int count=0;
		
		
		Scanner str=new Scanner(System.in);
		System.out.println("Enter a char ");
		String input=str.nextLine();
		
		 s=" "+s+" ";
		
		
		String[] words=s.split(input);
		for(String word:words)
		{
			count++;
		}
		
		System.out.println((count-1)+ " times the inputed char repeateds");
		
		
		

		
		
	}
}
