package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Contribuinte;
import entities.PessoaFisica;
import entities.PessoaJuridica;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		List<Contribuinte> lista = new ArrayList<>();
		
		System.out.print("Enter the number of tax payers: ");
		int pagantes = sc.nextInt();
		
		sc.nextLine();
		
		for (int i = 0; i < pagantes; i++) {
			System.out.println("Tax payer #" + (i+1) + " data:");
			System.out.print("Individual or company (i/c)? ");
			char option = sc.next().charAt(0);
			sc.nextLine();
			System.out.print("Name: ");
			String nome = sc.nextLine();
			System.out.print("Anual income: ");
			double rendaAnual = sc.nextDouble();
			
			if (option == 'i') {
				System.out.print("Health expenditures: ");
				double gastosSaude = sc.nextDouble();
				lista.add(new PessoaFisica(nome, rendaAnual, gastosSaude));
			}
			else if (option == 'c') {
				System.out.print("Number of employees: ");
				int numFuncionarios = sc.nextInt();
				lista.add(new PessoaJuridica(nome, rendaAnual, numFuncionarios));
			}
		}
		
		System.out.println();
		System.out.println("TAXES PAID:");
		double somaImpostos = 0;
		for (Contribuinte c : lista) {
			System.out.println(c);
			somaImpostos += c.calcularImposto();
		}
		
		System.out.println();
		System.out.printf("TOTAL TAXES: $ %.2f", somaImpostos);
		
		sc.close();
		
	}

}
