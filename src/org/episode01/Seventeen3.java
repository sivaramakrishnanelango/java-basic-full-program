package org.episode01;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Seventeen3 {
public static void main(String[] args) {
	Map<Integer, String> m = new LinkedHashMap<Integer,String>();
	
	
	//set- linkedhashmap by using for loop 
	m.put(10, "c++");
	m.put(10, "C");
	m.put(20, "c++");
	m.put(30, "java");
	m.put(40, "testng");
	m.put(10, "junit");
	
	System.out.println(m);
	
	
	Set<Entry<Integer, String>> entrySet = m.entrySet();
	for (Entry<Integer, String> entry : entrySet) {   // it will give one by one output
		System.out.println(entry);
		
		System.out.println(entry.getKey());
		System.out.println(entry.getValue());  // it will also one by one output i.e key on first row and values on second row
	}
		
	}
}

