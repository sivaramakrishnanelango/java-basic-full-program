package org.episode01;

public class Fourteen {
	 public static void main(String[] args) {
		
	  
	
	//array
	
	    //Index ---0  1  2  3   4
		int a[] = {10,20,30,40,50};
		//length---1   2  3  4  5
		
		
		//to find the number of length
		int length = a.length;
		System.out.println(length);
		
		//to get the particular index value 
		System.out.println(a[0]);
		
		System.out.println("\n");
		
		// print in reverse order 
		for (int i = a.length -1; i >= 1; i--) {
			System.out.println(a[i]);
		}
		System.out.println("\n");
		
		// print in insertion
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	 }		

}
