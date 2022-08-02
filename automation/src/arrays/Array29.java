
//sum of elements in array
package com.arrays;

import java.util.Scanner;

public class Array29 {
public static void main(String[] args) {
	int []array= {5,10,11,20};
	int first=0;
	int second=0;
	int temp;
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter index of the first value you want ");
	int n=sc.nextInt();
	
	System.out.println("Enter index of the second value you want ");
	int n1=sc.nextInt();
	
	for (int i = 0; i < array.length; i++)
	{
		first=array[n];
		
	}
	System.err.println(first);
	

	for (int i = 0; i < array.length; i++)
	{
		second=array[n1];
		
	}
	System.err.println(second);
	
	System.out.println("===========================");
	
	for(int i=0;i<array.length;i++)
	{
		if(i==n ||i==n1) {
	temp=array[n];
	array[n]=array[n1];
	array[n1]=temp;
	}
	System.err.println(array[i]);
	
	
    }
	
	
	
	
}
}