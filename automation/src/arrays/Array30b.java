
//sum of elements in array
package com.arrays;

import java.util.Scanner;

public class Array30b {
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
	
	
	
	System.out.println("===========================");
	

	
	if(n<array.length && n1<array.length) {
	
		temp=array[n];
		array[n]=array[n1];
		array[n1]=temp;
	}
	
	for(int i=0;i<array.length;i++)
	{
	
	System.out.println(array[i]);
    }

}
}