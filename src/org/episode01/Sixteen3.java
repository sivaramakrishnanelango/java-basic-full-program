package org.episode01;

import java.util.LinkedHashSet;
import java.util.Set;

public class Sixteen3 {
public static void main(String[] args) {
	
	
	//set-linkedhashset type
	//it will print in insertion order
	
	
	Set<Integer> s = new LinkedHashSet<Integer>();
	
	s.add(20);
	s.add(36);
	s.add(20);
	s.add(40);
	s.add(50);
	s.add(45);
	
	System.out.println(s);
}
}
