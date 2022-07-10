package com.bridgelabz;
import java.util.ArrayList;
import java.util.Scanner;

public class StockAccount {
	ArrayList<Stock>al=new ArrayList<>();
	static Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) {
		StockAccount sa=new StockAccount();
		System.out.println("Welcome to Stock Management");
		while(true) {
			System.out.println("Enter the choice\n 1.Enter the new Stock\n 2.Display Stock report\n 3.Exit");
			int choice=sc.nextInt();
			switch(choice) {
				case 1 : sa.addStocks();
				case 2 : sa.stockReport();
				case 3 : {
					System.out.println("Exiting");
					System.exit(0);
				}
			}
		}
	}
	public void addStocks() {
		Stock stock=new Stock();
		System.out.println("Enter the stock name");
		stock.setstockNames(sc.next());
		System.out.println("Enter the number of shares present");
		stock.setnumOfShare(sc.nextDouble());
		System.out.println("Enter the share prices");
		stock.setsharePrice(sc.nextDouble());
		al.add(stock);
	}
	public void stockReport() {
		double sum=0.0;
		System.out.println("Stock Report");
		System.out.println("Stock name       Number of Shares      Share price     Total price of Stock");
		for(int i=0; i<al.size(); i++) {
			Stock s=al.get(i);
			double totalPrice=s.getnumOfShare()*s.getsharePrice();
			totalPrice=sum+totalPrice;
			System.out.format("%-10s       %-10.3f      %-10.3f       %-10.3f \n ",s.getstockNames(),s.getnumOfShare(),s.getsharePrice(),totalPrice);
		}
	}
}
