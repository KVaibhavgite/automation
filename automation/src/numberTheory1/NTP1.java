package com.numberTheory;

public class NTP1 {

	public static void main(String[] args) {
	int a=68;
	int b=10;
	int c=4000;
	int d=2000;
	
	
int v=(a<b && a<c?a:b<a && b<c?b:c);
System.out.println("smaller number :"+v);
int g=(a>b && a>c && a>d?a:b>a && b>c && b>d?b:c>a && c>b && c>d?c:d);
System.out.println("bigger number :"+g);   

	}

}


//




