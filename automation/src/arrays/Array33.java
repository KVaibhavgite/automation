//read only even indexed ele from an array.


//sum of elements in array
package com.arrays;

public class Array33 {
 
		public static void main(String[] args) {
			int a[] = { 10,20,30,40,50 };
			int temp=0;
			for (int i = 0; i <= a.length / 2; i++) {
				for (int j = a.length - 1; j >= a.length / 2; j--) {
					if (i % 2 == 0 && j % 2 == 0) {
						temp=a[i];
						a[i]=a[j];
						a[j]=temp;
						i++;
					} else {
						i++;
					}
				}
				break;
			}
			for (int k=0;k<a.length;k++) {
				System.out.print(a[k]+" ");
			}
		}
	}

