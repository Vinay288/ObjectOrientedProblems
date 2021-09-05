package com.bridgelabz.inventorymanagement;

public class Item {
	private String name;
	private double weight,pricePerKg;
	public Item(String name,double weight,double pricePerKg) {
		this.name=name;
		this.weight=weight;
		this.pricePerKg=pricePerKg;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public double getPricePerKg() {
		return pricePerKg;
	}
	public void setPricePerKg(double pricePerKg) {
		this.pricePerKg = pricePerKg;
	}
}
