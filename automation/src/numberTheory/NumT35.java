package co.numberTheory;



public class NumT35 {

	public static void main(String[] args) {
	
		int a=0,b=1,c;
		int count=0;
		
		System.out.println(a);
		System.out.println(b);
		c=a+b;
		System.out.println(c);
		
		
		while(count!=10)
		{
			a=b;
			b=c;
			c=a+b;
			count++;
			System.out.println(c);
			
		}
		
		
	}}
