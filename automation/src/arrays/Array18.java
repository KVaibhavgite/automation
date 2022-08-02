
//sum of elements in array
package com.arrays;

public class Array18 {
public static void main(String[] args) {
	
int size=5;


	int []array= {5,10,11,20,30,40,50,60};
	int minimum=array[array.length/2];
	
	
	
	for(int i=array.length/2;i<array.length;i++)
	{
		if(minimum<array[i])
		{
		minimum=array[i];
		
		}
	}
	System.out.println(minimum);
}
}
