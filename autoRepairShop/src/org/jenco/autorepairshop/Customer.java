package org.jenco.autorepairshop;

public class Customer {

	private String name;
	private double accountBalance;
	
	public Customer(String name, double accountBalance) {
		this.name = name;
		this.accountBalance = accountBalance;
	}
	
	public String getName() {
		return name;
	}
	
	public double getAccountBalance() {
		return accountBalance;
	}
}
