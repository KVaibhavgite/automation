//read only even indexed ele from an array.


//sum of elements in array
package com.arrays;

public class Array24 {
public static void main(String[] args) {
	
int size=5;
int sum=0;
	int []array= {10,20,30,40,50,60};
	
	
	
	
	for(int i=0;i<array.length;i++)
	{
		if(i%2==0)
		{
			System.out.println(array[i]);
		}
	}
	
}
}
