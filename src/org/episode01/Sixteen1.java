package org.episode01;

import java.util.LinkedList;
import java.util.List;

public class Sixteen1 {
public static void main(String[] args) {
	
	List<Integer> li = new LinkedList<Integer>();
	List<Integer>  l = new LinkedList<Integer>();
	
	li.add(5);
	li.add(10);
	li.add(15);
	li.add(20);
	li.add(25);
	li.add(30);
	li.add(35);
	
	l.add(8);
	l.add(16);
	l.add(25);
	l.add(32);
	l.add(30);
	l.add(48);
	l.add(56);
	
	
	
	System.out.println(li);
	System.out.println(l);  //before retain all 
	
	l.retainAll(li);
	System.out.println(l);   //after retain all
	System.out.println(li);
	
	
	l.removeAll(li);
	System.out.println(l);
	System.out.println(li);
}
}
