package com.Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.NavigableSet;
import java.util.TreeMap;

public class Collection31{

	public static void main(String a[]) {
		
		ArrayList<String> listt=new ArrayList<>();
		
		listt.add("suraj");
		listt.add("radha");
		listt.add("surajw");
		listt.add("raaj");
		
		
		System.out.println(listt);
		List<String> synchronizedList = Collections.synchronizedList(listt);
		
		System.out.println(synchronizedList);
		
}
	}

