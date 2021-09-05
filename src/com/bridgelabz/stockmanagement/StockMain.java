package com.bridgelabz.stockmanagement;

import java.util.Scanner;

public class StockMain {
	
	public static void main(String[] args) {
		System.out.println("Enter total number of stocks");
		Scanner scanner = new Scanner(System.in);
		int number =scanner.nextInt();
		StockPortfolio stockArray= new StockPortfolio(number);
		for(int i=0;i<number;i++) {
			System.out.println("enter name,number of shares,price per share");
			String name=scanner.next();
			float numberOfShares=scanner.nextFloat();
			float price=scanner.nextFloat();
			Stock stock=new Stock(name, numberOfShares, price);
			stockArray.addStock(stock);
		}
		StockImpl stockOperation=new StockImpl();
		stockOperation.generateStockReport(stockArray);

	}

}
