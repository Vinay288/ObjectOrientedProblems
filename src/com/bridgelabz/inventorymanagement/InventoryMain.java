package com.bridgelabz.inventorymanagement;

import java.util.Scanner;

public class InventoryMain {

	public static void main(String[] args) {
		System.out.println("Enter total number of items");
		Scanner scanner = new Scanner(System.in);
		int numberOfItems =scanner.nextInt();
		InventoryFactory factory1=new InventoryFactory("factory1",numberOfItems);
		InventoryFactory factory2=new InventoryFactory("factory2",numberOfItems);
		InventoryManager manager=new InventoryManager(2);
		
		for(int i=0;i<numberOfItems;i++) {
			System.out.println("enter item name,weight and price per kg");
			String name=scanner.next();
			float weight=scanner.nextFloat();
			float pricePerKg=scanner.nextFloat();
			Item item = new Item(name,weight,pricePerKg);
			factory1.addItem(item);
		}
		for(int i=0;i<numberOfItems;i++) {
			System.out.println("enter item name,weight and price per kg");
			String name=scanner.next();
			float weight=scanner.nextFloat();
			float pricePerKg=scanner.nextFloat();
			Item item = new Item(name,weight,pricePerKg);
			factory2.addItem(item);
		}
		manager.addFactory(factory1);
		manager.addFactory(factory2);
		InventoryImpl inventoryImpl=new InventoryImpl();
		inventoryImpl.valueOf(manager);

	}

}
