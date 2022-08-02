package com.Collection;



import java.util.ArrayList;
import java.util.Collections;

public class Collection34 {

	public static void main(String a[]){
		ArrayList arrl = new ArrayList();
		arrl.add(10);
		arrl.add(20);
		arrl.add(30);
		arrl.add(40);
		
		Object max = Collections.max(arrl);
		System.out.println(max);
		
		
	
		
	}
}