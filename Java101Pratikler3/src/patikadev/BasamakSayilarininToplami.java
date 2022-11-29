package patikadev;

import java.util.Scanner;

public class BasamakSayilarininToplami {

	public static void main(String[] args) {
		int number, numberCounter = 0, residual, result = 0;
		Scanner input = new Scanner(System.in);

		System.out.println("Please enter a number  :  ");
		number = input.nextInt();

		while (number != 0) {
			residual = number % 10;
			result += residual;
			number /= 10;
		}

		System.out.println("Result  : " + result);
	}

}
