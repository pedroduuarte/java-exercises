package application;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class Program {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.print("What is the dollar price? ");
		double dollarPrice = input.nextDouble();
		System.out.print("How many dollars will be bought? ");
		double boughtDollar = input.nextDouble();
		
		double result = CurrencyConverter.dollarConverter(dollarPrice, boughtDollar);
		System.out.printf("Amount to be paid in reais = %.2f%n", result);
		
		
		input.close();

	}

}