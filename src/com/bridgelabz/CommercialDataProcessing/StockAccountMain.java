package com.bridgelabz.CommercialDataProcessing;

import java.util.Scanner;

public class StockAccountMain {

	public static void main(String[] args) {
		System.out.println("enter total number of company");
		Scanner scanner = new Scanner(System.in);
		int numberOfCompany = scanner.nextInt();
		StockAccount stockAccount = new StockAccount(numberOfCompany);
		stockAccount.buy(10, "idea");
		stockAccount.sell(5, "idea");
		stockAccount.buy(20, "tesla");
		stockAccount.printReport();

	}

}
