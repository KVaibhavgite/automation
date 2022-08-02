
//sum of elements in array
package com.arrays;

public class SecondMax {
	
public static void main(String[] args) {
	
int size=5;
int sum=0;
	int []array= {10,14,15,20,30,40,50};
	int maximum=array[0];
	int min2=0;
	
	for(int i=0;i<array.length;i++)
	{
		if(maximum<array[i])
		{
		maximum=array[i];
		
		}
	}
	System.out.println("firstmax "+maximum);
	int max1=maximum;
	
	
	for(int i=0;i<array.length;i++)
	{
//		System.err.println(max1);
		if(array[i]<maximum )
		{
		max1=array[i];
		
		

		}
	}
	System.err.println(max1);
	
	
	
	
	
}
}
