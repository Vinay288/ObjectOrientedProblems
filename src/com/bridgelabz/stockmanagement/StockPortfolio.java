package com.bridgelabz.stockmanagement;

public class StockPortfolio {
	Stock stockArray[];
	private Stock stock;
	
	private int stockIndex = 0;

	public StockPortfolio(int stocks) {
		stockArray = new Stock[stocks];
	}

	public void addStock(Stock stock) {
		stockArray[stockIndex++] = stock;;
	}

	public Stock[] getStockArray() {
		return this.stockArray;
	}
}
