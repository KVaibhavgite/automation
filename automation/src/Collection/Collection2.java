package com.Collection;

import java.util.ArrayList;

public class Collection2 {

	public static void main(String[] args) {
		ArrayList ls=new ArrayList();
		ls.add(15);
		ls.add("rupa");
		ls.add("omkar");
		ls.add(90);
		
		
		
		
		System.out.println(ls);
		ArrayList ls1=new ArrayList();
		
		boolean b=ls1.containsAll(ls);
		
		System.out.println(b);
	}

}
