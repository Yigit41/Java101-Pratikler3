package patikadev;

import java.util.Scanner;

public class UsluSayiHesaplama {

	public static void main(String[] args) {
		
		int n,k,result=1;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter the number to be exponentially :  ");
		n = input.nextInt();
		
		System.out.println("Please enter the power number :  ");
		
		k = input.nextInt();
		
		
		for(int i=0;i<k;i++) 
		{
			
			result *=n;
			
			
		}
		
		System.out.println("Result : "+result);
		input.close();
	}
	
}
