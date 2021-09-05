package com.bridgelabz.CommercialDataProcessing;

import java.util.Date;

public class CompanyShares {
private String stockSymbol;
private float numberOfShares;
private Date transctionTime;
public CompanyShares(String stockSymbol,float numberOfShares,Date transctionTime) {
	this.stockSymbol=stockSymbol;
	this.numberOfShares=numberOfShares;
	this.transctionTime=transctionTime;
}
public String getStockSymbol() {
	return stockSymbol;
}
public void setStockSymbol(String stockSymbol) {
	this.stockSymbol = stockSymbol;
}
public float getNumberOfShares() {
	return numberOfShares;
}
public void setNumberOfShares(float numberOfShares) {
	this.numberOfShares = numberOfShares;
}
public Date getTransctionTime() {
	return transctionTime;
}
public void setTransctionTime(Date transctionTime) {
	this.transctionTime = transctionTime;
}

}
