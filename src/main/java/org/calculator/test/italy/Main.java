package org.calculator.test.italy;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Type the first number: ");
		float n1 = sc.nextFloat();
		System.out.println("Type the second number: ");
		float n2 = sc.nextFloat();
		
		sc.close();
		
		Calculator c = new Calculator();

		System.out.println("Sum " + c.add(n1, n2));
		System.out.println("Subtraction " + c.subtract(n1, n2));
		System.out.println("Division " + c.divide(n1, n2));
		System.out.println("Multiplication " + c.multiply(n1, n2));
	}
}
