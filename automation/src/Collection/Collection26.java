
package com.Collection;
import java.util.HashMap;
import java.util.Set;
import java.util.TreeMap;

public class Collection26 {
	
	public static void main(String a[]){
		TreeMap<String, String>tm=new TreeMap<>();
		//add key-value pair to hashmap
		
		TreeMap<String, String>tm1=new TreeMap<>();
		tm1.put("radha","krishna");
		tm1.put("aditi","suraj");
		tm1.put("ram", "seeta");
		System.out.println(tm1);
		
		Set<String> keySet = tm1.keySet();
		System.out.println(keySet);
	}
}
	