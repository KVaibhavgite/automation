package co.numberTheory;
import java.util.Scanner;
public class NumT27 {

	public static void main(String[] args) {
		
	Scanner scanner=new Scanner(System.in);
	
	System.out.println("Enter a numbers within which you want prime numbers ");
	
	int start=scanner.nextInt();
	int end=scanner.nextInt();
	boolean isPrime=true;
	int prime=0;
	int sum=0;
	for(int l=start;l<end;l++) 
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
//			System.out.println(""+l+" is prime");
		sum=sum+l;

	}
	

	}
	System.out.println(sum);
	}
}