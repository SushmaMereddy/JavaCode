package com.practice.oops.inheritance;

public class ElectronicDiscount {
	
	public String ename="ipad";
	
	public int calculateDiscount(int actualPrice, int percentage) {
		return actualPrice - (actualPrice * percentage/100);
	}

}
