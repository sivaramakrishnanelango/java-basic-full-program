package org.episode01;

public class Thirteendaystring {
public static void main(String[] args) {
	
	//literal string
	// sysout kulla system.indentityhashcode select pannanum
	        String s = "sivaram";
	        String s1 = "sivaram";	
			String s3 = "ramakrishnan";
			
			System.out.println("literal string");
			System.out.println(System.identityHashCode(s));
			System.out.println(System.identityHashCode(s1));
			System.out.println(System.identityHashCode(s3));
			
	// Non literal string
			
			String s4 = new  String ("krishnan");
			String s5 = new String ("krishnan");
			String s6 = new String ("sivaramakrishnan");
			
			System.out.println("\n non literal string");
			System.out.println(System.identityHashCode(s4));
			System.out.println(System.identityHashCode(s5));
			System.out.println(System.identityHashCode(s6));
			
	//immutable string
			
			String s7 = "greens";
			String s8 = "tech";
			
			System.out.println("\nimmutable string");
			System.out.println(System.identityHashCode(s7));
			System.out.println(System.identityHashCode(s8));
			
			String concat = s7.concat(s8);
			System.out.println(concat);
			System.out.println(System.identityHashCode(concat));
			
	//mutable string 
			
			StringBuffer  s9 = new StringBuffer( "panimalar");
			StringBuffer s10 = new StringBuffer("engineering");
			
			System.out.println("\nmutable string");
			System.out.println(System.identityHashCode(s9));
			System.out.println(System.identityHashCode(s10));
			
			StringBuffer append = s9.append(s10);
			System.out.println(append);
			System.out.println(System.identityHashCode(append));
		}
}
