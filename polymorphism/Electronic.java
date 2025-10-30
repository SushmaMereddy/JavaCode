package com.practice.oops.polymorphism;

public class Electronic extends DefaultDiscount{
	public int discount(int price) {
		return price-5;
	}
}
