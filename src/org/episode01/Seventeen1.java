package org.episode01;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Seventeen1 {
public static void main(String[] args) {
	Map<Integer, String> m = new LinkedHashMap<Integer, String>();
	
	m.put(10, "c");
	m.put(20, "c++");
	m.put(30, "Java");
	m.put(40, "testNG");
	m.put(10, "junit");
	
	System.out.println(m);
	
    String remove = m.remove(30);  // value 30 will be removed 
    System.out.println(remove);
    
    String string = m.get(10);      //to get the value i.e 2 time will be on output
    System.out.println(string);
    
    boolean empty = m.isEmpty();  // will check whether the object creation is empty or not 
    System.out.println(empty);
    
    boolean containsKey = m.containsKey(40);      //to get the value from 40
    System.out.println(containsKey);
    
    boolean containsValue = m.containsValue("testNG");    // to get the value in testng 
    System.out.println(containsValue);
    
    Set<Integer> keySet = m.keySet();                      //to print only key 
    System.out.println(keySet);
    
    Collection<String> values = m.values();                 // to print only values 
    System.out.println(values);
}
}
