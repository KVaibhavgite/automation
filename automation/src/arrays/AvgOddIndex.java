
//sum of elements in array
package com.arrays;

public class AvgOddIndex {
public static void main(String[] args) {
	
int size=5;
int sum=0;
int avg=0;
int count=0;
	int []array= {10,20,30,40,50};
	
	
	
	
	for(int i=0;i<array.length;i++)
	{
		if(i%2!=0) {
			count++;
		sum=sum+array[i];
		avg=sum/count;
		}
		else
		{
			continue;
		}
	}
	System.out.println(avg);
}
}
