package org.episode01;

public class Polymorphism {
	private static final String M = null;
	private void studentdetails() {
		System.out.println("student details are given below");

	}
	private void studentdetails(int age ) { 
		System.out.println("my age is:"+age);
	}
	private void studentdetails(char time) {
		System.out.println("my time is :"+time);
	}
	private void studentsdetails(String length) {
		System.out.println("our legth :"+length);

	}
	private void studentdetail(long length,float weight) {
	 System.out.println("length should be :"  +"weight is :"+weight);

	}
	private void studentdetail(boolean result ) {
		System.out.println("true");

	}
	public static void main(String[] args) {
		Polymorphism p = new Polymorphism();
		p.studentdetails();
		p.studentdetails(12);
		p.studentdetails(26);
		p.studentsdetails(M);
		p.studentdetail(36L, 96F);
		p.studentdetail(true);
		
	}

		


	

	}



