package com.Collection;



import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Collection4 {

	public static void main(String a[]){
		ArrayList <String>arrl = new ArrayList<>();
		arrl.add("First");
		arrl.add("Second");
		arrl.add("Third");
		arrl.add("Random");
		
		
		
		
		
		for(String str:arrl)
		{
			System.out.println(str);
		}
		Collections.shuffle(arrl);
		System.out.println("======s");

		for(String str:arrl)
		{
			System.out.println(str);
		}

}
}

