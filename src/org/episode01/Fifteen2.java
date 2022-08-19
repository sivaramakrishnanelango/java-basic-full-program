package org.episode01;

import java.util.LinkedList;
import java.util.List;

public class Fifteen2 {
public static void main(String[] args) {
	
	
	//METHODS UNDER LIST
	
	List<Integer> li = new LinkedList<Integer>();

	
	li.add(12);
	li.add(20);
	li.add(25);
	li.add(32);
	li.add(35);
	li.add(25);
	
	System.out.println(li);
	
	li.set(0, 15);                     //to replace the value
	System.out.println(li);
	
	li.set(3, 34);
	System.out.println(li);
	
	int indexof=li.indexOf(25);             //to get the index position
	System.out.println(indexof);
	
	int lastIndexof = li.lastIndexOf(25);       //to get the last index position
	System.out.println(lastIndexof);
	
	
	li.clear();                                 //to clear all the value
	System.out.println(li);
	
	boolean empty=li.isEmpty();                 //to check list is empty
	System.out.println(empty);
	
	boolean contains = li.contains(32);
	System.out.println(contains);
	
}
}
