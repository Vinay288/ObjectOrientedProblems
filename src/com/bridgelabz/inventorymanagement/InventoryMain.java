package com.bridgelabz.inventorymanagement;

import java.util.Scanner;

import com.bridgelabz.stockmanagement.Stock;
import com.bridgelabz.stockmanagement.StockPortfolio;

public class InventoryMain {

	public static void main(String[] args) {
		System.out.println("Enter total number of items");
		Scanner scanner = new Scanner(System.in);
		int numberOfItems =scanner.nextInt();
		Inventory inventory=new Inventory(numberOfItems);
		for(int i=0;i<numberOfItems;i++) {
			System.out.println("enter item name,weight and price per kg");
			String name=scanner.next();
			float weight=scanner.nextFloat();
			float pricePerKg=scanner.nextFloat();
			Item item = new Item(name,weight,pricePerKg);
			inventory.addItem(item);
		}
		InventoryImpl inventoryImpl=new InventoryImpl();
		inventoryImpl.valueOf(inventory.getItemArray());

	}

}
