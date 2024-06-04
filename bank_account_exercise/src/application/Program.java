package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Client;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		Client client;
		
		
		System.out.println("Enter account number: ");
		String accountNumber = sc.nextLine();
		
		System.out.println("Enter account holder: ");
		String name = sc.nextLine();
		
		System.out.println("Is there an initial deposit? (y/n): ");
		String option = sc.nextLine();
		
		if(option.equals("y")) {
			System.out.println("Enter initial deposit value: ");
			double inicialDeposit = sc.nextDouble(); 
			client = new Client(accountNumber, name, inicialDeposit);
		}
		else {
			client = new Client(accountNumber, name);
		}
		
		System.out.println("");
		System.out.println("Account Data:");
		System.out.println(client);
		System.out.println("");
			
		System.out.println("Enter a deposit value: ");
		double depositValue = sc.nextDouble();
		client.deposit(depositValue);
		System.out.println("");
		
		System.out.println("Updated account data:");
		System.out.println(client);
		
		System.out.println("Enter a whitdraw value: ");
		double valueWithdraw = sc.nextDouble();
		client.withdraw(valueWithdraw);
		
		System.out.println(client);
		

		sc.close();
	}

}