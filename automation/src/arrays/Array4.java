
//sum of elements in array
package com.arrays;

public class Array4 {
	
public static void main(String[] args) {
	
int size=5;
int sum=0;
	int []array= {10,14,15,20,30,40,50};
	int minimum=array[0];
	int min2=0;
	
	for(int i=0;i<array.length;i++)
	{
		if(minimum>array[i])
		{
		minimum=array[i];
		
		}
	}
	System.out.println("firstmin "+minimum);
	int min1=minimum;
	
	
	for(int i=0;i<array.length;i++)
	{
		if(array[i]>min1 &&array[i]!=min1)
		{
		min1=array[i];
		break;

		}
	}
	System.err.println(min1);
	
	
	
	
	
}
}
