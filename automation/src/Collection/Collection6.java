package com.Collection;



import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Collection6 {

	public static void main(String a[]){
		ArrayList <String>arrl = new ArrayList<>();
		arrl.add("First");
		arrl.add("Second");
		arrl.add("Third");
		arrl.add("Random");
		
		
		
		
		Collections.swap(arrl, 1, 3);
		System.out.println(arrl);

}
}

