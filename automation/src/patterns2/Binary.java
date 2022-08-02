//package com.patterns2;
//
//public class Binary{
//
//	public static void main(String[] args) {
//		int a=0;
//	int n=5;
//	for(int i=0;i<n;i++)
//	{
//		
//		for(int j=0;j<(2*i)+1;j++)
//			
//			if(j%2==0) {
//				++a;
//				System.out.print(a);
//		
//			}
//			else
//			System.out.print("* ");
//		
//
//			
//				System.out.print("  ");
//				a=0;
//			
//		
//		System.out.println();
//	}
//
//	}
//}
////

package com.patterns2;

public class Binary{

	public static void main(String[] args) {
		int a=1;
	int n=5;
	for(int i=0;i<n;i++)
	{
		
		for(int j=0;j<(2*i)+1;j++)
			
			if(j%2==0) 
			{
				System.out.print(a++%2);
		
			}
		
			/*else if(a%2==0 &&j%2==0){
				a++;
				System.out.print(a);
				--a;
				
			}*/
			else
			

				System.out.print("* ");
			
		
		System.out.println();
	}

	}
}







/*package com.patterns2;

public class Binary{

	public static void main(String[] args) {
		int a=1;
	int n=5;
	for(int i=0;i<n;i++)
	{
		
		for(int j=0;j<(2*i)+1;j++)
			
			if(j%2==0) {
				System.out.print(a);
		a++;
			}
		
			else if(a%2==0 &&j%2==0){
				System.out.print("* ");
				a--;
			}
			else
			

				System.out.print("  ");
			
		
		System.out.println();
	}

	}
}
//

*/