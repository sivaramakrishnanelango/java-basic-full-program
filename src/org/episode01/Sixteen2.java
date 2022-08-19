package org.episode01;

import java.util.HashSet;
import java.util.Set;

public class Sixteen2 {
public static void main(String[] args) {
	
	
	//set -hashset type
	//print in random order
	//does not allow duplicates
	
	Set s = new HashSet();
	
	s.add("java");
	s.add("oracle");
	s.add("java");
	s.add(30);
	s.add(36);
	s.add(30);
	
	System.out.println(s);
			
}
}
