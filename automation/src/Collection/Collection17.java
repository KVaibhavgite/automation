
package com.Collection;
import java.util.HashMap;
import java.util.Set;

public class Collection17 {
	
	public static void main(String a[]){
		HashMap<String, String> hm = new HashMap<String, String>();
		//add key-value pair to hashmap
		
		HashMap<String, String> hm1 = new HashMap<String, String>();
		hm1.put("radha","krishna");
		hm1.put("aditi","suraj");
		hm1.put("ram", "seeta");
		System.out.println(hm1);
		
		Set<String> keySet = hm1.keySet();
		System.out.println(keySet);
	}
}
	