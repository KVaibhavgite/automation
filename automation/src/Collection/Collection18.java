
package com.Collection;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Collection18 {
	
	public static void main(String a[]){
		HashMap<String, String> hm = new HashMap<String, String>();
		//add key-value pair to hashmap
		
		HashMap<String, String> hm1 = new HashMap<String, String>();
		hm1.put("radha","krishna");
		hm1.put("aditi","suraj");
		System.out.println(hm1);
		
		 Set<Entry<String, String>> entrySet = hm1.entrySet();
		
		System.out.println(entrySet);
	}
}
	