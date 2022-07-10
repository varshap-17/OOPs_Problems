package com.bridgelabz;

import java.util.Scanner;
import java.util.ArrayList;

public class Account {
	 static Scanner sc = new Scanner(System.in);
	 ArrayList<Stock> al = new ArrayList<>();
	 static double balance = 10000000;

	 public void addStock() {
	      Stock stock;
	      stock = new Stock();
	      double withdraw = 0;
	      System.out.println(" Enter the Stock name");
	      sc.nextLine();
	      stock.setstockNames(sc.nextLine());
	      System.out.println("Enter the Number of shares");
          stock.setnumOfShare(sc.nextDouble());
	      System.out.println("Enter the each share price");
	      stock.setsharePrice(sc.nextDouble());
	      withdraw = stock.getsharePrice() * stock.getnumOfShare();
	      if(balance>=withdraw) {
	    	  balance = balance - withdraw;
	          al.add(stock);
	          System.out.println("Remaining balance = "+balance);
	      }else
	          debit(withdraw);
	  }

	 public void printStockReport() {
	     Stock stock;
	     stock = new Stock();
	     for (int i = 0; i < al.size(); i++) {
	    	 stock = al.get(i);
	         System.out.println(stock.toString());
	     }
	}
	
	 public void debit(double withdraw) {
	       if (withdraw > balance) {
	            System.out.println("Debit amount exceeded account balance.");
	            System.out.println("Remaining balance = "+balance);
	            System.out.println("withdraw = "+withdraw);
	       }
	 }

	 public static void main(String[] args) {
	        Account stockManagement = new Account();
	        while (true) {
	            System.out.println("Enter the selection\n1)addStock\n2)displayStockReport\n3)exit");
	            byte choice = sc.nextByte();
	            switch (choice) {
	                case 1 -> stockManagement.addStock();
	                case 2 -> stockManagement.printStockReport();
	                case 3 -> System.exit(1);
	            }
	        }
	 }
}