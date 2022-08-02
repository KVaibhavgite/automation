package com.arrays;

public class Array36 {
public static void main(String[] args) {
	int array[]= {10,20,30,40,50};
	int temp=0;
	
	temp=array[array.length-1];
	for(int i=array.length-1;i>=0;i--)
	{
		if(i==0)
		{
			array[i]=temp;
		}
		else {
			array[i]=array[i-1];
			
		}}
		
		for (int j = 0; j < array.length; j++) {
			System.out.println(array[j]);
		}
		
}
	

}
