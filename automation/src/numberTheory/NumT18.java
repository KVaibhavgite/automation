package co.numberTheory;

import java.util.Scanner;

public class NumT18 {
	

	public static void main(String[] args) {
		System.out.println("Enter a number and see the magic : ");
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		
		
		int suraj=num;
	    int reverse1=0;
	    int reverse2=0;
	    
	    String ss=String.valueOf(num);
	
	    for(int i=0;i<=(ss.length()/2)-1;i++)
	    {
	    	int unit=num%10;
	    	reverse1=reverse1*10+unit;
	    	num=num/10;
	    	
	    }
	
	    System.err.println(reverse1);
	  //
	    int reverseNew1=0;
	    for(int i=0;i<=(ss.length()/2)-1;i++)
	    {
	    	int unit=reverse1%10;
	    	reverseNew1=reverseNew1*10+unit;
	    	reverse1=reverse1/10;
	    	
	    }  
	    
	    System.out.println(reverseNew1);
   
	    int	reversee=0;
	
	    while(num!=0)
	    {
	    	int unitt=num%10;
	    	reversee=reversee*10+unitt;
	    	num=num/10;
	    	
	    }
	    System.err.println(reversee);

	    System.out.println("The resultant number is : "+reversee+reverseNew1);
//	}
	
	}
}