package com.bridgelabz.CommercialDataProcessing;

public interface StockAccountIf {
	void buy(int amount, String symbol);
	void sell(int amount, String symbol);
	void save(String fileName);
	void printReport();	
	double valueOf();
}
