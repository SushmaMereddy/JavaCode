package com.practice.oops.polymorphism;

public class CalculatorDemo {
	
	public void addition(int a, int b) {
		System.out.println(a+b);
	}
	public void addition(int a, int b, int c) {
		System.out.println(a+b+c);
	}
	public void addition(int a, int b, int c, int d) {
		System.out.println(a+b+c+d);
	}
	
//	public static void main(String[] args) {
//		CalculatorDemo c=new CalculatorDemo();
//		c.addition(2, 3);
//	}
}
