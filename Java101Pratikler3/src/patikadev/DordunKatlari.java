package patikadev;

import java.util.Scanner;

public class DordunKatlari {

	public static void main(String[] args) {

		int sum = 0, number = 0;

		Scanner input = new Scanner(System.in);

		while (number % 2 == 0) {
			System.out.println("Please Enter  Number : ");

			number = input.nextInt();
			if (number % 4 == 0) {
				sum += number;
			}
		}

		System.out.println("Sum : " + sum);
	}

}
