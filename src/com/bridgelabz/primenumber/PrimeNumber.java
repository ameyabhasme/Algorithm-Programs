package com.bridgelabz.primenumber;

import java.util.Scanner;

public class PrimeNumber {

	private final Scanner sc = new Scanner(System.in);

	public void findPrimeNumber() {
		System.out.print("Enter first no : ");
		int first = sc.nextInt();
		System.out.print("Enter last no : ");
		int last = sc.nextInt();
		System.out.println("\nPrime numbers between " + first + " and " + last + " are : ");
		int counter;
		for (int i = first; i <= last; i++) {
			counter = 0;
			for (int j = 1; j <= i; j++) {
				if (i % j == 0)
					counter = counter + 1;
			}
			if (counter == 2)
				System.out.println(i);
		}
	}

	public static void main(String[] args) {
		PrimeNumber primeNo = new PrimeNumber();
		primeNo.findPrimeNumber();
	}
}
