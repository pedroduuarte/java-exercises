package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		Student stud = new Student();
		System.out.println("Student name: ");
		stud.name = sc.nextLine();
		System.out.println("Inform the first grade: ");
		stud.grade1 = sc.nextDouble();
		System.out.println("Inform the second grade: ");
		stud.grade2 = sc.nextDouble();
		System.out.println("Inform the third grade: ");
		stud.grade3 = sc.nextDouble();
		
		System.out.println(stud.finalGrade());
		
	}

}