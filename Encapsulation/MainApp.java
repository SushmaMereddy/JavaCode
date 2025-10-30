package com.practice.oops.Encapsulation;

public class MainApp {
	
	public static void main(String[] args) {
		System.out.println("===MainApp===");
		Organization org=new Organization();
		org.displayEmployees();
		System.out.println("Emp1: "+ org.emp1);
	}

}
