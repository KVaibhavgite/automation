package com.Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeMap;

public class Collection32{

	public static void main(String a[]) {
		
		HashSet<String> hs=new HashSet<>();
		
		hs.add("suraj");
		hs.add("radha");
		hs.add("surajw");
		hs.add("raaj");
		
		
		System.out.println(hs);
		Set<String> synchronizedSet = Collections.synchronizedSet(hs);
		
		System.out.println(synchronizedSet);
		
}
	}

