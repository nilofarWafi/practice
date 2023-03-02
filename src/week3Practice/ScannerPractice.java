package week3Practice;

import java.util.Scanner;

public class ScannerPractice {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
	      int firstNumber=0;
	        int secondNumber=0;

	        int result = 0 ;
	        String opretore = " ";


	        System.out.println("please enter to number: ");

	        firstNumber=sc.nextInt();
	        secondNumber=sc.nextInt();


	        System.out.println("please select opratore:  ");

	        opretore=sc.next();

	        if (opretore.equals("+")) {
	            result= firstNumber + secondNumber;

	        } else {
	            System.out.println("nothing");
	        }

	        System.out.println(firstNumber + opretore + secondNumber + " = " + result);
//	        int num=11;
//	        if(num%3==0 && num%5==0) {
//	        	System.out.println("Tekscool");
//	        }else if(num%3==0) {
//	        	System.out.println("Tek");
//	        }else if(num%5==0) {
//	        	System.out.println("school");
//	        }else {
//	        	System.out.println(num);
//	        }


}
}
