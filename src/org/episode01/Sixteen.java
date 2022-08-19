package org.episode01;

import java.util.LinkedList;
import java.util.List;

public class Sixteen {
public static void main(String[] args) {
	
	//list method
	
	List<Integer> li = new LinkedList<Integer>();
	List<Integer>  li3 = new LinkedList<Integer>();
	
	
	li.add(12);
	li.add(22);
	li.add(32);
	li.add(42);
	li.add(52);
	li.add(62);
	
	
	System.out.println(li); 
	System.out.println(li3);   //before add all 
	
	
	li3.addAll(li);
	
	System.out.println(li);    //after add all
	System.out.println(li3);
}
}
