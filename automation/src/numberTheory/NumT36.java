package co.numberTheory;



public class NumT36 {

	public static void main(String[] args) {
	
		int a=0,b=1,c=100;
		int count=0;
		
		System.out.println(a);
		System.out.println(b);
		c=a+b;
		System.out.println(c);
		
		
		while(c<10000)
		{
			a=b;
			b=c;
			c=a+b;
			count++;
			System.out.println(c);
			
		}
		
		
	}}
