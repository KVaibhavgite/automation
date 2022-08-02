package com.Collection;



import java.util.ArrayList;
import java.util.HashSet;

public class Collection20 {

	public static void main(String a[]){
		ArrayList<String> arrl = new ArrayList<String>();
		arrl.add("First");
		arrl.add("Second");
		arrl.add("Third");
		arrl.add("Random");
		System.out.println("Actual ArrayList:"+arrl);
		
		HashSet<String> hs=new HashSet<>(arrl);
		
		
		System.out.println(hs);
		}
	
}