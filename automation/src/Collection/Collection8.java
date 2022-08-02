package com.Collection;



import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;

public class Collection8 {

	public static void main(String a[]){
		LinkedList <String>arrl= new LinkedList<>();
		arrl.add("First");
		arrl.add("Second");
		arrl.add("Third");
		arrl.add("Random");
		arrl.add("rez");
		arrl.add("radheya");
		arrl.add("baala");
		arrl.add("fogg");
		
		Collections.reverse(arrl);
		
		
		System.out.println(arrl);
		
		
	}
}

		
		