
//sum of elements in array
package com.arrays;

public class Array17 {
public static void main(String[] args) {
	
int size=5;
int sum=0;

	int []array= {5,10,11,20,30,40,50,60};
	int minimum=array[0];
	
	
	
	for(int i=0;i<array.length/2;i++)
	{
		if(minimum<array[i])
		{
		minimum=array[i];
		
		}
	}
	System.out.println(minimum);
}
}
