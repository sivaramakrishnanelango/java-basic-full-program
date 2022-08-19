package org.episode01;

public class Ninthdayabstract2 extends Ninthdayabstract {



@Override
public void companyname() {
	System.out.println("amazon");
	
}

@Override
public void companylocation() {
  System.out.println("chennai");
	
}
public static void main(String[] args) {
	Ninthdayabstract2  n = new Ninthdayabstract2();
	n.companydetails();
	n.companyid();
	n.companylocation();
	n.companyname();

}
}