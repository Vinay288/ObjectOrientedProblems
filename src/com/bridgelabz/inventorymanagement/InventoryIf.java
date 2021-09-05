package com.bridgelabz.inventorymanagement;

public interface InventoryIf {
	void valueOf(Item itemArray[],String itemName);
	void valueOf(Item itemArray[]);
	void valueOf(InventoryManager manager);
	void valueOf(InventoryFactory factory);
}
