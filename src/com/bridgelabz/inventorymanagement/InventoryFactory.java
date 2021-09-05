package com.bridgelabz.inventorymanagement;

public class InventoryFactory {
	private String name;
	private Item item;
	private Item inventoryArray[];
	private int index = 0;
	
	public InventoryFactory(String name,int numberOfItems) {
		this.name=name;
		inventoryArray = new Item[numberOfItems];
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void addItem(Item item) {
		inventoryArray[index++] = item;
	}
	public Item[] getItemArray() {
		return this.inventoryArray;
	}

}
