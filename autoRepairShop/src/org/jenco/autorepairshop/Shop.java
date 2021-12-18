package org.jenco.autorepairshop;

public class Shop {

	private String name;
	private double accountBalance;
	
	public Shop(String name, double accountBalance) {
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
