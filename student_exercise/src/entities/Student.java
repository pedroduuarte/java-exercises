package entities;

public class Student {
	public String name;
	public double grade1;
	public double grade2;
	public double grade3;
	
	public String finalGrade() {
		double result = grade1 + grade2 + grade3;
		if (result >= 60) {
			return "FINAL GRADE = " + String.format("%.2f%n", result) + "PASS";				
		}
		else {
			return "FINAL GRADE = " + String.format("%.2f%n", result) + 
			"FAILED\nMISSNG " + (60 - result) + " POINTS";
		}
	}
}
	
