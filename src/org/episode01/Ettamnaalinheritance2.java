package org.episode01;
//childclass
public class Ettamnaalinheritance2 extends Ettamnaalinheritance {

	private void clientname() {
	System.out.println("client name is :amazon");
	

}
	private void clientid() {
		System.out.println("my client id :32654");
		

	}
	public static void main(String[] args) {
		Ettamnaalinheritance2 s = new  Ettamnaalinheritance2();
		s.clientname();
		s.clientid();
		System.out.println("========");
		s.employeeaccount();
		s.employeename();
		s.employeepin();
		
		
	}
}
