package com.bridgelabz;

public class Stock {
	private String stockNames;
	private Double numOfShare;
	private Double sharePrice;
	
	public Stock() {
		super();
	}
	//Parameterized
	public Stock(String stockNames, Double numOfShare, Double sharePrice) {
		super();
		this.stockNames = stockNames;
		this.numOfShare = numOfShare;
		this.sharePrice = sharePrice;
	}
	//gets and sets
	public String getstockNames() {
		return stockNames;
	}
	public void setstockNames(String stockNames) {
		this.stockNames=stockNames;
	}
	public Double getnumOfShare() {
		return numOfShare;
	}
	public void setnumOfShare(Double numOfShare) {
		this.numOfShare=numOfShare;
	}
	public Double getsharePrice() {
		return sharePrice;
	}
	public void setsharePrice(Double sharePrice) {
		this.sharePrice=sharePrice;
	}
}
