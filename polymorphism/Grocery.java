package com.practice.oops.polymorphism;

public class Grocery extends DefaultDiscount {
	public int discount(int price) {
		return price-10;
	}
}
