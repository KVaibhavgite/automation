package com.Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeMap;

public class Collection33{

	public static void main(String a[]) {
		
		HashMap<String,String> hm=new HashMap<>();
		
		hm.put("suraj","10");
		hm.put("radha","11");
		hm.put("surajw","13");
		hm.put("raaj","14");
		
		System.out.println(hm);
		
		Map<String, String> synchronizedMap = Collections.synchronizedMap(hm);
		
		System.out.println(synchronizedMap);
				
}
	}

