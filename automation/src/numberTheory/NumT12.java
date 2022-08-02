package co.numberTheory;

import java.util.Scanner;

public class NumT12 {

public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the numbers to be checked whether they are in raising order or not : ");
	int f=sc.nextInt();
	int f1=sc.nextInt();
	int f2=sc.nextInt();
	int f3=sc.nextInt();
	
	
	
	
		if(f<f1 && f1<f2 && f2<f3)
		{
		System.out.println("raising order");	
		}
		
		else
		{
			System.out.println("not in raising order");
		}
	}
	
	
	
}


