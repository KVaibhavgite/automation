package co.numberTheory;

import java.util.Scanner;

public class NumT10 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the limits to have sum of even numbers beetween  : ");
	int f=sc.nextInt();
	int l=sc.nextInt();
	int m;
	int sum=0;
	
	for(int i=f+2;i<l;i++)
	{
	if(i%2==0)
	{
	sum=sum+i;
	
	}
	}
	System.out.println(sum);
	
	
	
}


} 