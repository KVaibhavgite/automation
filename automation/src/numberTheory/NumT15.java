package co.numberTheory;

import java.util.Scanner;

public class NumT15 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value of  a");
		int a=sc.nextInt();
		int count=0;
		int sum=0;
		int unit;
		while(a!=0)
		{
			unit=a%10;
			sum=sum+unit;
			a=a/10;
			
			
			
		}
		
		System.out.println("sum of digits : " +sum);
	}
}
