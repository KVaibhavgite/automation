
//sum of elements in array
package com.arrays;

public class Array14 {
public static void main(String[] args) {
	
int size=5;
int sum=0;
	int []array= {10,20,30,40,50,60};
	
	
	
	
	for(int i=(array.length/2);i<array.length;i++)
	{
		sum=sum+array[i];
	}
	System.out.println(sum);
}
}
