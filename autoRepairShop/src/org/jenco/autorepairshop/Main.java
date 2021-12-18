package org.jenco.autorepairshop;

import java.util.Scanner;


public class Main {


	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("welcome to J's Garage");
		System.out.println(" ");
		System.out.println("let's create a transaction");
		System.out.println(" ");
		
		System.out.println("please input customer name: ");
		String customerName = scanner.next();
		
		System.out.println("please input shop name: ");
		String shopName = scanner.next();
		
		System.out.println("please input transaction amount: ");
		double amount = scanner.nextDouble();
		
		int transactionNumber = (int) (Math.random() * 1000000);
		
		Transaction transaction = new Transaction(transactionNumber, customerName, shopName, amount);
		
		
		
		System.out.println(" ");
		System.out.println(" ****** TRANSACTION RECORDED ****** ");
		System.out.println("");
		System.out.println("transaction number: " + transaction.getTransactionNumber());
		System.out.println("customer name: " + transaction.getCustomerName());
		System.out.println("shop name: " + transaction.getshopName());
		System.out.println("total amount: $" + transaction.getAmount());
	}

}
