package application;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities_enum.OrderStatus;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		OrderItem item;
		Product product;
		
		System.out.println("Enter client data:");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.nextLine();
		System.out.print("Birth date (DD/MM/YYYY): ");
		String strBirthDate = sc.nextLine();
		LocalDate birthDate = LocalDate.parse(strBirthDate, DateTimeFormatter.ofPattern("dd/MM/yyyy"));;
		
		Client client = new Client(name, email, birthDate);
		
		System.out.println();
		System.out.println("Enter order data:");
		System.out.print("Status: ");
		String status = sc.nextLine();
		System.out.print("How many items to this order? ");
		int quantity = sc.nextInt();
		
		Order order = new Order(LocalDateTime.now(), OrderStatus.valueOf(status), client);
		
		for (int i = 1; i <= quantity; i++) {
			sc.nextLine();
			System.out.println("Enter #" + i + " item data:");
			System.out.print("Product name: ");
			String productName = sc.nextLine();
			System.out.print("Product price: ");
			double productPrice = sc.nextDouble();
			System.out.print("Quantity: ");		
			int productQuantity = sc.nextInt();
			product = new Product(productName, productPrice);
			item = new OrderItem(productPrice, productQuantity, product);
			
			order.addItem(item);
		}
		
		System.out.println();
		System.out.println("ORDER SUMMARY:");
		System.out.println(order);
		System.out.println();
		
		sc.close();
	}

}
