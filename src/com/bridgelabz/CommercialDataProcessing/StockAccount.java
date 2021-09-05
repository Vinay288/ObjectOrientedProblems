package com.bridgelabz.CommercialDataProcessing;

import java.util.Date;

public class StockAccount implements StockAccountIf {

	private CompanyShares companySharesArray[];
	private int totalNumberOfComapny = 0;
	private CompanyShares companyShares;

	public StockAccount(int numberOfCompany) {
		companySharesArray = new CompanyShares[numberOfCompany];
	}

	@Override
	public void buy(int amount, String symbol) {
		for (int i = 0; i < this.totalNumberOfComapny; i++) {
			if (companySharesArray[i].getStockSymbol().equals(symbol)) {
				companySharesArray[i].setNumberOfShares(companySharesArray[i].getNumberOfShares() + amount);
				companySharesArray[i].setTransctionTime(new Date());
				return;
			}
		}
		companySharesArray[totalNumberOfComapny++] = new CompanyShares(symbol, amount, new Date());
	}

	@Override
	public void sell(int amount, String symbol) {
		for (int i = 0; i < this.totalNumberOfComapny; i++) {
			if (companySharesArray[i].getStockSymbol().equals(symbol)) {
				if ((companySharesArray[i].getNumberOfShares() - amount) < 0) {
					System.out.println("Sorry you own less shares");
					return;
				}
				companySharesArray[i].setNumberOfShares(companySharesArray[i].getNumberOfShares() - amount);
				companySharesArray[i].setTransctionTime(new Date());
				return;
			}
		}
		System.out.println("ypu dont own any shares of " + symbol);
	}

	@Override
	public void save(String fileName) {
		// TODO Auto-generated method stub

	}

	@Override
	public void printReport() {
		for (int i = 0; i < totalNumberOfComapny; i++) {
			System.out.println("company Symbol " + companySharesArray[i].getStockSymbol());
			System.out.println("company shares " + companySharesArray[i].getNumberOfShares());
			System.out.println("recent tranaction info " + companySharesArray[i].getTransctionTime());
		}

	}

	@Override
	public double valueOf() {
		double totalAmount = 0f;
		for (int i = 0; i < totalNumberOfComapny; i++) {
			totalAmount += companySharesArray[i].getNumberOfShares();
		}
		return totalAmount;
	}

}
