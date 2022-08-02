package com.patterns;

public class D{

	public static void main(String[] args) {
		
	int n=5;
	for(int i=0;i<n;i++)
	{
		
		for(int j=0;j<n;j++)
			
			if((i==1 && j>=1 &&j<=n-2)||(i==3 && j>=1 &&j<=n-2)||(i==2&&j==1)||(i==2&&j==3)||(i==n-1&&j==n-1))
		{
			System.out.print("* ");
		}
			else
			{
				System.out.print("  ");
			}
		
		System.out.println();
	}

	}
}