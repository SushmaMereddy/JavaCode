package com.practice.oops.polymorphism;

public class DiscountApp {
	public static void main(String[] args) {
		DefaultDiscount d=new Grocery();
		int finalPrice = d.discount(100);
		System.out.println(finalPrice);
	}
}
