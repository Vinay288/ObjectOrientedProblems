package com.bridgelabz.stockmanagement;

public class Stock {
	private String name;
	private float numberOfShare, price;

	public Stock(String name, float numberOfShare, float price) {
		this.name = name;
		this.numberOfShare = numberOfShare;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getNumberOfShare() {
		return numberOfShare;
	}

	public void setNumberOfShare(float numberOfShare) {
		this.numberOfShare = numberOfShare;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

}
