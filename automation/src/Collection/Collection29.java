package com.Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.TreeMap;

public class Collection29 {

	public static void main(String a[]) {
		TreeMap<String, String> hm = new TreeMap<String, String>(new MyCompr());

		hm.put("suraj", "aditi");
		hm.put("radheya", "vrushali");
		hm.put("raj", "10");
		hm.put("raj", "12");
		hm.put("raaj", "15");

		System.out.println(hm);
		
		
		
		String firstKey = hm.firstKey();
		
		System.out.println(firstKey);
		

	}
}

