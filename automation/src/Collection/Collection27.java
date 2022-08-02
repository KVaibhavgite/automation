
package com.Collection;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Collection27 {
	
	public static void main(String a[]){
		TreeMap<String, String>tm=new TreeMap<>();
		//add key-value pair to hashmap
		
		TreeMap<String, String>tm1=new TreeMap<>();
		tm1.put("radha","krishna");
		tm1.put("aditi","suraj");
		System.out.println(tm1);
		
		Set<Entry<String, String>> entrySet = tm1.entrySet();
		
		System.out.println(entrySet);
	}
}
	