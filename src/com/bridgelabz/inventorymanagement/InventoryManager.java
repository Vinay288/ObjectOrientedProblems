package com.bridgelabz.inventorymanagement;

public class InventoryManager {
private InventoryFactory inventoryFactory;
private InventoryFactory[] factoryArray;
private int factoryIndex=0;
public InventoryManager(int numberOfFactory) {
	factoryArray=new InventoryFactory[numberOfFactory];
}
public void addFactory(InventoryFactory factory) {
	factoryArray[factoryIndex++]=factory;
}
public InventoryFactory[] getFactory() {
	return factoryArray;
}
}
