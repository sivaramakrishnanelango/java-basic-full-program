package org.episode01;

import java.util.Set;
import java.util.TreeSet;

public class Sixteen4 {
public static void main(String[] args) {
	
	//set-treeset type
	//it will present in ascending order
	
	Set<Integer> s = new TreeSet<Integer>();
	
	s.add(20);
	s.add(25);
	s.add(30);
	s.add(35);
	s.add(30);
	s.add(25);
	s.add(20);
	
	System.out.println(s);
	
	
	//for loop is used in print one by one
	//which are print in low to high
	
	
	for (Integer integer : s) {
		System.out.println(integer);
	}
}
}
