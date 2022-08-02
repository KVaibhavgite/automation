
package com.Collection;
import java.util.HashMap;
import java.util.TreeMap;

public class Collection24 {
	
	public static void main(String a[]){
		TreeMap<String, String>tm=new TreeMap<>();
		//add key-value pair to hashmap
		tm.put("first", "FIRST INSERTED");
		tm.put("second", "SECOND INSERTED");
		tm.put("third","THIRD INSERTED");
		System.out.println(tm);
		if(tm.containsKey("first")){
			System.out.println("The hashmap contains key first");
		} else {
			System.out.println("The hashmap does not contains key first");
		}
		if(tm.containsKey("fifth")){
			System.out.println("The hashmap contains key fifth");
		} else {
			System.out.println("The hashmap does not contains key fifth");
		}
	}
}