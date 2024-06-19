package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Product> products = new ArrayList<>();

		System.out.print("Enter a file path: ");
		String path = sc.nextLine();

		File sourceFile = new File(path);
		String folderStr = sourceFile.getParent();

		boolean sucess = new File(folderStr + "\\out").mkdir();
		String targetFile = folderStr + "\\out\\summary.txt";

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			String item = br.readLine();

			while (item != null) {
				String[] s = item.split(",");
				String name = s[0];
				double unityPrice = Double.parseDouble(s[1]);
				int quantity = Integer.parseInt(s[2]);

				products.add(new Product(name, unityPrice, quantity));
				item = br.readLine();
			}

			try (BufferedWriter bw = new BufferedWriter(new FileWriter(targetFile))) {

				for (Product p : products) {
					bw.write(p.toString());
					bw.newLine();
				}

				System.out.println(targetFile + " CREATED!");
			} catch (IOException e) {
				System.out.println("Error writing file: " + e.getMessage());
			}
		} catch (IOException e) {
			System.out.println("Error writing file: " + e.getMessage());
		}

	}

}
