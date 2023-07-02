package com.anderson.accountManager;

import java.util.Scanner;

public class AccountManager {
	private double accountNumber;
	private String holderName;
	private double Balance;
	
	Scanner sc = new Scanner(System.in);
	
	public AccountManager(){
		System.out.print("Enter account number: ");
		this.accountNumber = sc.nextDouble();
		
		System.out.print("Enter account holder: ");
		this.holderName = sc.next();
		
		System.out.print("Is there an initial deposit? (y/n) ");
		
		if(sc.next().equals("y")) {
			System.out.println("Enter initial deposit value: ");
			this.Balance = sc.nextDouble();
		}
		
		this.printAccountStatus();
		this.accountDeposit();
		this.accountWithDraw();
	}
	
	private void printAccountStatus() {
		System.out.println("Account " + this.accountNumber + " Holder: " + this.holderName +" Balance: " + this.Balance);
	}
	
	private void accountDeposit(){
		System.out.println(" Enter a deposit value: ");
		this.Balance = this.Balance + sc.nextDouble();
		this.printAccountStatus();
	}
	
	private void accountWithDraw(){
		System.out.println("Enter a withdraw value: ");
		this.Balance = this.Balance - sc.nextDouble();
		this.printAccountStatus();
	}
	
}
