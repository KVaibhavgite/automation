
package com.Collection;
import java.util.HashMap;

public class Collection14 {
	
	public static void main(String a[]){
		HashMap<String, String> hm = new HashMap<String, String>();
		//add key-value pair to hashmap
		hm.put("first", "FIRST INSERTED");
		hm.put("second", "SECOND INSERTED");
		hm.put("third","THIRD INSERTED");
		System.out.println(hm);
		
		
		
		
		HashMap<String, String> hm1 = new HashMap<String, String>();
		hm1.put("radha","krishna");
		hm1.put("aditi","suraj");
		System.out.println(hm1);
		
		
		hm.putAll(hm1);
		
		System.out.println(hm);
		
	}
}