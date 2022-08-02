package com.Collection;



import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;

public class Colection5 {

	public static void main(String a[]){
		LinkedList <String>arrl= new LinkedList<>();
		arrl.add("First");
		arrl.add("Second");
		arrl.add("Third");
		arrl.add("Random");
		
		
		
		String[] strArr = new String[arrl.size()];
		arrl.toArray(strArr);
		System.out.println("Created Array content:");
		for(String str:strArr){
			System.out.println(str);
}
	}
}

