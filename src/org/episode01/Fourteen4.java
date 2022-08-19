package org.episode01;

import java.util.ArrayList;
import java.util.List;

public class Fourteen4 {
public static void main(String[] args) {
	
	
	//upcasting
	List li = new ArrayList();
	
	
	li.add('m');
	li.add("java");
	li.add(36);
	li.add(true);
	li.add(36.5F);
	li.add(653.32);
	
	//to find number of length
	System.out.println(li.size());
	
	
	//to get the particular index value
	Object object = li.get(5);
	System.out.println(object);
	
	System.out.println(li);
}
}
