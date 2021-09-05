package com.bridgelabz.inventorymanagement;

public class InventoryImpl implements InventoryIf {

	@Override
	public void valueOf(Item itemArray[], String itemName) {
		for (int i = 0; i < itemArray.length; i++) {
			if (itemArray[i].getName().equals(itemName)) {
				System.out.println("item name: " + itemName);
				System.out.println(
						"item value is: " + (double) (itemArray[i].getWeight() * itemArray[i].getPricePerKg()));
				return;
			}
		}
		System.out.println("no item found");
		return;
	}

	@Override
	public void valueOf(Item itemArray[]) {
		double totalValue = 0.0;
		for (int i = 0; i < itemArray.length; i++) {
			totalValue += (itemArray[i].getWeight() * itemArray[i].getPricePerKg());
		}
		System.out.println("total value is: " + totalValue);

	}

}
