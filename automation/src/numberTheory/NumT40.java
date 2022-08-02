package co.numberTheory;


public class NumT40 {

	public static void main(String[] args) {
		
		int n=457;
		int temp=n;
		int sum=0;
		
		while(n>0) {
		
			int unit=n%10;
			sum=sum+unit*unit*unit;
			n=n/10;
		}
		
		
		System.out.println("sum"+sum);
		if(temp==sum) {
			System.out.println("armstrong");
			
		}
		else
		{
			System.out.println("non armstrong");
		}

}
}

