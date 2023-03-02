package week3Practice;

import java.time.LocalDate;
import java.util.Scanner;

public class Week33S {

	public static void main(String[] args) {
//		 LocalDate n=LocalDate.now();
//		 System.out.println(n.getYear());
//		 System.out.println(n.getMonthValue());
//		 System.out.println(n.getDayOfWeek());
		String []nilo=new String[10];
		nilo[0]="wafi";
		nilo[1]="fat";
		System.out.println(nilo[0]);
		System.out.println(nilo[1]);
		double[]grades=new double[15];
		grades[0]=65;
		grades[1]=75;
		System.out.println(grades[1]);
		
		int[]nums=new int[5];
		nums[0]=10;
		nums[1]=11;
		nums[2]=14;
		nums[3]=78;
		nums[4]=7;
		System.out.println(nums[0]+", "+nums[1]+", "+nums[2]+", "+nums[3]+", "+nums[4]);
		int sum1=nums[0]+nums[1];
		int num2=nums[2]+nums[3];
		System.out.println(sum1/nums[4]*num2);
		int[]n= {12,3,4,9};
		System.out.println(n.length);
		

	}

}
