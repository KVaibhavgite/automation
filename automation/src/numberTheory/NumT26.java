package co.numberTheory;
import java.util.Scanner;
public class NumT26 {

	public static void main(String[] args) {
	
	boolean isPrime=true;
//	int prime=0;
	int count=0;
	int sum=0;
	for(int l=0;l<=300;l++) 
	{
		int i;
		for(i=2;i<l;i++)
		{


			if(l%i==0)
			{
				
				isPrime=false;
				
				break;
			}

		}
		if(i==l) {
			if(count!=30) {
			count++;
//			System.out.println(""+l+" is prime");
			sum=sum+l;
			}
			
			else
			{
				break;
			}
			
			}
		
	}
	System.out.println(sum);
	}
}

	