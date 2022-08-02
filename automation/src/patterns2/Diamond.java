package com.patterns2;

public class Diamond {

	public static void main(String[] args) {
		int n = 3;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < (2*i)+1; j++) {
				if (i+j>=i) {
					
					System.out.print("* ");
				
				} else {
					System.out.print(" ");
				}

			}
			System.out.println();
		}
//		for (int i = 0; i < (2*i); i++) {
//			for (int j = 0; j < n; j++) 
//				if (i <=j) {
//					System.out.print("* ");
//				}
//				else
//				{
//					System.out.print(" ");
//				}
//			System.out.println();
		}
		
	

}
