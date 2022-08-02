package co.numberTheory;

import java.util.Scanner;

public class NumT9 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the limits to have odd numbers between those : ");
	int f=sc.nextInt();
	int l=sc.nextInt();
	int m;
	
	for(int i=f;i<l;i++)
	{
	if(i%2!=0)
	{
		System.out.println(""+i);
	}
	}
	
	
	
}


}