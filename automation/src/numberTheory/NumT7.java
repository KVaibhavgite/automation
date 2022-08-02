package co.numberTheory;

import java.util.Scanner;

public class NumT7 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter number to check even or odd  : ");
	int f=sc.nextInt();

	
	
	if(f%2==0)
	{
		System.out.println("even");
	}
	
	else
	{
		System.out.println("odd");
	}

}

}