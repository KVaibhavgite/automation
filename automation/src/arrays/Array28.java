
//sum of elements in array
package com.arrays;

import java.util.Scanner;

public class Array28 {
public static void main(String[] args) {
	int []array= {5,10,11,20};
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter index of the value you want ");
	int n=sc.nextInt();
	
	for (int i = 0; i < array.length; i++) {
		if(array[i]==n)
		{
			System.out.println(i);
		}
}
}
}


























////sum of elements in array
//package com.arrays;
//
//import java.util.Scanner;
//
//public class Array28 {
//public static void main(String[] args) {
//	Scanner sc=new Scanner(System.in);
//	
//	System.out.println("Enter index of the value you want ");
//	int n=sc.nextInt();
//	int []array= {5,10,11,20};
//	int temp;
//	System.out.println(array[n]);
//}
//}