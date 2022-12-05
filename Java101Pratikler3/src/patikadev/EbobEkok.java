package patikadev;

import java.util.Scanner;

public class EbobEkok {

	public static void main(String[] args) {
			int num1, num2, k,ebob = 1, ekok;;
	        Scanner input = new Scanner(System.in);
	        System.out.print("Please Enter The First Number : ");
	        num1 = input.nextInt();
	        System.out.print("Please Enter The Second Number:");
	        num2 = input.nextInt();
	            
	        k=num1;

	        while (k <= num1){
	            if (num1 % k == 0 && num2 % k == 0){
	                ebob = k;
	                break;
	            }
	            k--;
	        }
	        System.out.println("EBOB:" +ebob);
	        ekok = num1* num2 / ebob;
	        System.out.println("EKOK:" +ekok);
	        input.close();
	}

}
