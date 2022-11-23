package patikadev;

import java.util.Scanner;

public class DortVeBesınKuvvetleri {

	public static void main(String[] args) {
		int number;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please Enter Positive Number");
		
		number = input.nextInt();
		
		System.out.println("Forces of Four");

		for(int i=1;i<number;i*=4 ) 
		{
			
			System.out.println(i);
		}
		System.out.println("Forces of Five");
		for(int i=1;i<number;i*=5 ) 
		{
			
			System.out.println(i);
		}
	}

}
