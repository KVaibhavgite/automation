
//sum of elements in array
package com.arrays;

import java.util.Scanner;

public class Array31 {
public static void main(String[] args) {
	int []array= {5,10,11,20};
	int first=0;
	int second=0;
	int temp;
	
	for(int i=0;i<array.length;i++)
	{
		System.out.println(array[i]);
	}
	

	System.out.println("==============");
	
	for(int j=(array.length/2)-1;j>=0;j--) {
		System.out.println(array[j]);
	}
	
	for(int j=(array.length/2);j<array.length;j++) {
		System.out.println(array[j]);
	
}
}
}