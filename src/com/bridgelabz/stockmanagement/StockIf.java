package com.bridgelabz.stockmanagement;

public interface StockIf {
	public void generateStockReport(StockPortfolio stockArray);
	public float valueOfStock(String name,StockPortfolio stockArray);
}
