package com.practice.oops.inheritance;

public class MainApp {
	public static void main(String[] args) {
	ElectronicDiscount ed= new ElectronicDiscount();
	int finalPrice=ed.calculateDiscount(100,5);
	System.out.println("Electonic: " +finalPrice);
	
	GarmentDiscount gd=new GarmentDiscount();
	int finalGarmentPrice=gd.calculateDiscount(1000, 5);
	System.out.println("Garment: " +finalGarmentPrice);
	gd.greeting();
	System.out.println("Electronic device: " +gd.ename);
	}

}
