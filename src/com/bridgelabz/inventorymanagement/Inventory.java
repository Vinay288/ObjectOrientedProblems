package com.bridgelabz.inventorymanagement;

public class Inventory {
	private Item item;
	private Item inventoryArray[];
	private int index = 0;

	public Inventory(int numberOfItem) {
		inventoryArray = new Item[numberOfItem];
	}

	public void addItem(Item item) {
		inventoryArray[index++] = item;
	}
	public Item[] getItemArray() {
		return this.inventoryArray;
	}

}
