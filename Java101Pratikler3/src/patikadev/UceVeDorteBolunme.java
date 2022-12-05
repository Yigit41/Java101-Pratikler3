package patikadev;

import java.util.Scanner;

public class UceVeDorteBolunme {

	public static void main(String[] args) {
		
		int counter=0, sum=0, average=0,number;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please Enter Positive Number");
		
		number = input.nextInt();
		
		//checking the entered number
		while(number<0) 
		{
			System.out.println("Incorrect Entry");
			System.out.println("Please Enter Positive Number");
			number = input.nextInt();
		}
		
		System.out.println("Numbers divisible by 3 and 4");
		for(int i=1;i<=number;i++) 
		{
			if(i%12==0) 
			{
				sum += i;
				counter++;
				
				System.out.println("     "+i);
			}
			
			
		}
		
		average = sum/counter;
		
		System.out.println("+_______");
		System.out.println("     "+sum);
		System.out.println("\nTotal "+"- " +counter+" -"+ " numbers found");
		System.out.println("Average of numbers from 0 to "+number+ " divisible by 3 and 4 : "+average);

		input.close();
		
	}

}
