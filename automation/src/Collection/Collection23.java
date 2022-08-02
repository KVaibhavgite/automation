
package com.Collection;
import java.util.HashMap;
import java.util.TreeMap;

public class Collection23 {
	
	public static void main(String a[]){
		TreeMap<String, String>tm=new TreeMap<>();
		//add key-value pair to hashmap
		tm.put("first", "FIRST INSERTED");
		tm.put("second", "SECOND INSERTED");
		tm.put("third","THIRD INSERTED");
		System.out.println(tm);
		
		
		
		TreeMap<String, String>tm1=new TreeMap<>();
				tm1.put("radha","krishna");
				tm1.put("aditi","suraj");
		System.out.println(tm1);
		
		
		tm.putAll(tm1);
		
		System.out.println(tm);
		
	}
}
