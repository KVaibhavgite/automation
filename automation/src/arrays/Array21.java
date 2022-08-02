
//sum of elements in array
package com.arrays;

public class Array21 {
public static void main(String[] args) {
	

	int []array= {5,10,11,20};
	int temp;
	for(int i=0;i<array.length;i++)
	{
		
		System.out.println(array[i]);
	}
	
	System.out.println("++++++++");
	System.out.println("In reverse order");
	for(int j=array.length-1;j>=0;j--) {
		System.out.println(array[j]);
	}
	
}
}

