package com.string;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class String9{

	public static void main(String[] args) {
		String s="suraj is handsome guy";
		String name="";
		
		String[] words=s.split(" ");
		
//		for(int i=s.length();i<=0;i--)
//		{
//		System.out.println(a[i]);
//		}
		
		
		ArrayList<String> ls=new ArrayList();
		for(String word:words)
		{
			ls.add(word);
			
		}
		
		for(int j=ls.size()-1;j>=0;j--)
		{
			 name=ls.get(j);
			break;
		}
		
		String name2=name;
//		System.out.println(name);
		
		
		
//		System.out.println(ls);
		
		for(int i=0;i<=ls.size()-2;i++)
		{
			//System.out.println(ls.get(i));
			name2=name2+" "+ls.get(i)+" ";
		}
		System.out.println(name2);
		

		
		
	}
}
