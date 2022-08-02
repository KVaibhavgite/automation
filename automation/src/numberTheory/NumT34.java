package co.numberTheory;



public class NumT34 {

	public static void main(String[] args) {
	
		int a=0,b=1,c;
		
		System.out.println(a);
		System.out.println(b);
		c=a+b;
		System.out.println(c);
		
		
		while(c<100)
		{
			a=b;
			b=c;
			c=a+b;
			System.out.println(c);
			
		}
		
		
	}}
