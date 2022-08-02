
//sum of elements in array
package com.arrays;

public class Array3 {
public static void main(String[] args) {
	
int size=5;
int sum=0;
	int []array= {10,20,30,40,50};
	int maximum=array[0];
	for(int i=0;i<array.length;i++)
	{
		if(maximum<array[i])
		{
		maximum=array[i];
		
		}
	}
	System.out.println(maximum);
	
}
}
