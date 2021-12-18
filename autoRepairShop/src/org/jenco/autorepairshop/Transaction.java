package org.jenco.autorepairshop;


public class Transaction {

	private int transactionNumber;
	private String customerName;
	private String shopName;
	private double amount;
	
	public Transaction(int transactionNumber, String customerName, String shopName, double amount) {
		this.transactionNumber = transactionNumber;
		this.customerName = customerName;
		this.shopName = shopName;
		this.amount = amount;
	}
	
	
	
	public int getTransactionNumber() {
		return transactionNumber;
	}
	
	public String getCustomerName() {
		return customerName;
	}
	public String getshopName() {
		return shopName;
	}
	public double getAmount() {
		return amount;
	}
}
