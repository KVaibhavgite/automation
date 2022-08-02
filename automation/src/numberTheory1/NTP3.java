package com.numberTheory;

import java.util.Scanner;

public class NTP3 {

	public static void main(String[] args) {
//	int a=38;
//	int b=10;
//	int c=46;
//	
	Scanner s=new Scanner(System.in);
	System.out.println("enter three numbers");
	int a=s.nextInt();
	int b=s.nextInt();
	int c=s.nextInt();
	
	int v=(a>b && a>c?(b>c?b:c):b>a &&b>c?(a>c?a:c):c>a&&c>b?(b>a?b:a):0);
	System.out.println(v);
		}

}
