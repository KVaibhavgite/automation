package com.patterns2;

public class Diamond1 {

	public static void main(String[] args) {
		int n=5;
		int num=1;
		int spaces=n/2;
		int ele=1;
		int x;
		
		for(int i=0 ;i<n;i++)
		{
			for (int s = spaces; s > 0; s--) {
				System.out.print("  ");
			}
			for(int j=0;j<ele;j++)
			{
				if(j<n/2 && (j==1||j==2))
				{
					++num;
				}
				else
					--num;
				
			System.out.print(num + " ");
			if(num%2==0)
				{ 
				num=num+1;
				System.out.print(num);
			    }
			
			}
			
				if(i<n/2) 
				{
					spaces--;
					ele=ele+2;
				}
				else {
					spaces++;
					ele=ele-2;
					}
				System.out.println();
				
	}
}
}

