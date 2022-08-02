
package com.Collection;
import java.util.HashMap;

public class Collection16 {
	
	public static void main(String a[]){
		HashMap<String, String> hm = new HashMap<String, String>();
		//add key-value pair to hashmap
		
		HashMap<String, String> hm1 = new HashMap<String, String>();
		hm1.put("radha","krishna");
		hm1.put("aditi","suraj");
		System.out.println(hm1);
		
		if(hm1.containsValue("krishna"))
		{
			System.out.println("value found");
		}
	}
}
	