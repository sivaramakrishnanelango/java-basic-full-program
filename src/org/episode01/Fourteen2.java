package org.episode01;

public class Fourteen2 {
public static void main(String[] args) {
	
	
	//datatype varName[] = new Datatype [size];
	
	
	int a[] = new int[10];
	
	
	a[0]=10;
	
	a[2]=30;
	a[4]=40;
	a[5]=50;
	a[6]=60;
	a[7]=70;
	System.out.println(a.length);
	System.out.println(a[9]);
	System.out.println("\n");
	
	//normal for loop
	for (int i = 0; i < a.length; i++) {
		System.out.println(a[i]);
	}
	
	
	//enhanced for loop
	System.out.println("\n");
	for (int i : a) {
		System.out.println(i);
	}
}
}
