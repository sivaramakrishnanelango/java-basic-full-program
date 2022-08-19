package org.episode01;

import java.util.LinkedHashMap;
import java.util.Map;

public class Seventeeen {
public static void main(String[] args) {
	
	
	// map -linkedhashmap
	
	Map m = new LinkedHashMap();
	
	
	m.put(20, "java");
	m.put(25, "selenium");
	m.put(30, "testNG");
	m.put(40, "java");
	m.put(45, 5.8);
	m.put(25, "selenium");
	
	System.out.println(m);
	
	Object object = m.get(25);     // to get 25 value in output
	System.out.println(object);
	
	m.remove(40);                  // remove particular value 40 in output console
	System.out.println(m);
}
}
