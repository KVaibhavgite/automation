package co.numberTheory;

import java.util.Scanner;

public class NumT14 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value of  a");
		int a=sc.nextInt();
		int count=0;
		
		while(a!=0)
		{
			a=a/10;
			count++;
		}
		
		System.out.println("Number of digits :"+count);
	}
}
