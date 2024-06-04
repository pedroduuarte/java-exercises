package application;

import java.util.Scanner;

import entities.Retangulo;

public class Program {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Retangulo ret = new Retangulo();
        System.out.println("Enter rectangle width and height: ");
        ret.width = sc.nextDouble();
        ret.height = sc.nextDouble();

        System.out.printf("AREA = %.2f%n", ret.Area());
        System.out.printf("PERIMETER = %.2f%n", ret.Perimeter());
        System.out.printf("DIAGONAL = %.2f%n", ret.Diagonal());
        
        sc.close();
    }
}