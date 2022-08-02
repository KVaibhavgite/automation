package co.numberTheory;
import java.util.Scanner;
public class NumT29B {

	public static void main(String[] args) 
	{
		int i;

		for(int h=11;h<200;)
		{
			boolean isPrime=true;
			for(i=2;i<h;i++)
			{
				if(h%i==0)
				{

					isPrime=false;
					break;
					
				}

			}
			if(i==h)
			{
				System.out.println(""+h+" is prime");

			}
			h=h+10;

		}


	}
}