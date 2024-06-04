package application;

import java.util.Scanner;

import entities.Rent;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Rent rent;
		Rent[] vect = new Rent[10];
		
		System.out.print("How many rooms will be  rented? ");
		int qttRooms = sc.nextInt();
		
		for(int i = 0; i < qttRooms; i++) {
			sc.nextLine();
			
			System.out.println();
			System.out.println("Rent #" + (i+1));
			System.out.print("Name: ");
			String name = sc.nextLine();
			
			System.out.print("Email: ");
			String email = sc.nextLine();
			
			System.out.print("Room: ");
			int room = sc.nextInt();
			
			rent = new Rent(name, email);
			vect[room] = rent;
		}
		
		System.out.println();
		System.out.println("Busy rooms: ");
		
		for(int i = 0; i < 10; i++) {
			if (vect[i] != null) {
				System.out.println(i + ": " + vect[i].getName() + ", " + vect[i].getEmail());
			}
		}
		
		
		sc.close();
	}

}