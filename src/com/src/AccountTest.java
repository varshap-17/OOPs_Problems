package com.bridgelabz;
import java.util.Scanner;

public class AccountTest {
	static Scanner sc =new Scanner(System.in);
	static int  Acc_bal=10000;
	
	public static void debit() {
	
		System.out.println("Enter the debit amount : ");
		int debit_amt =sc.nextInt();
		
		while(debit_amt<Acc_bal) {
			for(int i=0; i<=Acc_bal; i++) {
				Acc_bal=Acc_bal-debit_amt;
				System.out.println("Remaining balance amount=" +Acc_bal);
			}
		}		
		if(debit_amt<=Acc_bal) {
		    	System.out.println("debit amount does not execeed");
		}else
			System.out.println("debit amount execeed account balance");
	}
	public static void main(String[] args) {
		System.out.println("Payment withdrawl from Savings Account");
		System.out.println("The Account balance is 10,000");
		debit();
	}
}