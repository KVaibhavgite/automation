package co.numberTheory;


import java.util.Scanner;

public class NumT16{
	

public static void main(String[] args) {
	

		System.out.println("Enter a number to  check if it is palindrome or not");
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		int suraj=num;
	    int	reverse=0;
	
	    while(num!=0)
	    {
	    	int unit=num%10;
	    	reverse=reverse*10+unit;
	    	num=num/10;
	    	
	    }
	    
	    
	    System.out.println("Reversed Number ="+reverse);
}
}
