package com.bridgelabz.stockmanagement;

public class StockImpl implements StockIf {

	@Override
	public void generateStockReport(StockPortfolio stockArray) {
		Stock[] stocks=stockArray.getStockArray();
		float totalValue = 0f;
		for (int i = 0; i < stocks.length; i++) {
			System.out.println("Share name: " + stocks[i].getName());
			System.out.println("shares owned: " + stocks[i].getNumberOfShare());
			System.out.println("total value: " + (stocks[i].getNumberOfShare() * stocks[i].getPrice()));
			totalValue += stocks[i].getNumberOfShare() * stocks[i].getPrice();
		}
		System.out.println("Total share price " + totalValue);
	}

	@Override
	public float valueOfStock(String name, StockPortfolio stockArray) {
		Stock[] stocks=stockArray.getStockArray();
		for (int i = 0; i < stocks.length; i++) {
			if (stocks[i].getName().equals(name)) {
				return (float) (stocks[i].getNumberOfShare() * stocks[i].getPrice());
			}
		}
		return 0f;
	}

}
