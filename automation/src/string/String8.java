package com.string;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class String8 {

	public static void main(String[] args) {
		String s="spike buster means switch board";
		
		String[] words=s.split(" ");
		
//		for(int i=s.length();i<=0;i--)
//		{
//		System.out.println(a[i]);
//		}
		
		
		ArrayList ls=new ArrayList();
		for(String word:words)
		{
			ls.add(word);
			
		}
		
		System.out.println(ls);
		
		for(int i=ls.size()-1;i>=0;i--)
		{
			System.out.print(ls.get(i)+" ");
		}
		
		
		
		
		
		
		
	}
}
