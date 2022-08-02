
package co.numberTheory;
import java.util.Scanner;
public class NumT23 {

	public static void main(String[] args) {
	
	boolean isPrime=true;
//	int prime=0;
	for(int l=50;l<=100;l++) 
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
		if(i==l)
			System.out.println(""+l+" is prime");
		
	}

	}
}

	



























	