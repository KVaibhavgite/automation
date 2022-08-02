package com.Collection;



import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;

public class Collection13 {

	public static void main(String a[]){
		HashSet<String>arrl= new HashSet<>();
		arrl.add("First");
		arrl.add("Second");
		arrl.add("Third");
		arrl.add("Random");
		arrl.add("rups");
		arrl.add("radheya");
		arrl.add("baala");
		arrl.add("fogg");
		arrl.add("aditi");
		
		System.out.println(arrl);
		
		HashSet<String>arrl1= new HashSet<>();
		arrl1.add("suraj");
		arrl1.add("rups");
		arrl1.add("aditi");
		
		boolean containsAll = arrl.containsAll(arrl1);
		
		System.out.println(containsAll);//compared
		
		
		boolean retainAll = arrl.retainAll(arrl1);
		System.out.println(retainAll);
		System.out.println(arrl);//retained
		
     
		
	}
}

		
		