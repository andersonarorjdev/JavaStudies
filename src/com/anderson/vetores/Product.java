package com.anderson.vetores;

public class Product {
	private String name;
	private double price;
	
	public Product(String name, double Price){
		this.name = name;
		this.price = Price;
	}
	
	public double getPrice() {
		return this.price;
	}
}
