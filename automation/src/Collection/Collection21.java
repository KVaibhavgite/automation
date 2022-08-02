package com.Collection;

import java.util.ArrayList;
import java.util.HashSet;

public class Collection21 {

	public static void main(String[] args) {
		
		
		
		ArrayList<String>arrl=new ArrayList<>();
		arrl.add("radha");
		arrl.add("radheya");
		arrl.add("krish");
		arrl.add("aditi");
		arrl.add("aditi");
		arrl.add("suraj");	
		arrl.add("suraj");
		System.out.println(arrl);
		
		
		for(int i=0;i<arrl.size();i++)
		{
			for(int j=i+1;j<arrl.size();j++)
			{
				if(arrl.get(i)==arrl.get(j)) {
					System.out.println(arrl.get(i));
					
				}
			}
		}
		
		
		
		
		
		
		
	}

}
