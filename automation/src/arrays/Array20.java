
//sum of elements in array
package com.arrays;

public class Array20 {
public static void main(String[] args) {
	
int size=5;
double sum=0;
double avg=0;

	int []array= {5,10,11,20,30,40,50,60};
	int minimum=array[0];
	
	
	
	for(int i=array.length/2;i<array.length;i++)
	{
		sum=sum+array[i];
		avg=sum/(array.length/2);
	}
	System.out.println(avg);
}
}
