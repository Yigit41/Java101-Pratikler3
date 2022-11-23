package patikadev;

import java.util.Scanner;

public class Kombinasyon {

	public static void main(String[] args) {
		long  factN=1,factR=1,factNR=1,inN,inR,comb;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("n : ");
		
		inN = input.nextInt();

		System.out.println("r : ");
		
		inR = input.nextInt();
		
		for(int i=1;i<=inN;i++) 
		{
			factN *=i;
		}
		for(int i=1;i<=inR;i++) 
		{
			factR *=i;
		}
		for(int i=1;i<=inN-inR;i++) 
		{
			factNR *=i;
		}
		
		comb = factN/(factR*factNR);
		
		System.out.println("Combination : "+comb);
	}

}
