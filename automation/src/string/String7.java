package com.string;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class String7 {

	public static void main(String[] args) {
		String s="suraj is good boy and suraj is not a bad boy";
		int count=0;
		String[] a=s.split(" ");
		boolean b=false;

		HashSet<String>nodup=new HashSet<>();
		for(String bad : a)
		{
			//System.out.println(bad);
			if(nodup.add(bad)==false)
			{
				System.out.println(bad);
				count++;
				
			}
		}
		System.out.println(count);
		
	}
}
