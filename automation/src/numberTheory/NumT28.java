
package co.numberTheory;
import java.util.Scanner;
public class NumT28 {

	public static void main(String[] args) {
	
	boolean isPrime=true;
//	int prime=0;
	for(int l=70;l>=20;l--) 
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











	