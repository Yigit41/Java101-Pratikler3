package patikadev;

import java.util.Scanner;

public class HarmonikSayi {

	public static void main(String[] args) {
		int number;
		double result = 0;
		
		Scanner input = new Scanner(System.in);

		
		System.out.println("Please enter a positive number  :  ");
		
		number = input.nextInt();
		
		
		 for (double i = 1; i <= number; i++) {

			 result += 1 / i;
	        }
	        System.out.println(result);
		
	        input.close();
	        
	        input.close();
	}

}
