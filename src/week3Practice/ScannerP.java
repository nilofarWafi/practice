package week3Practice;

import java.util.Scanner;

public class ScannerP {

	public static void main(String[] args) {
		Scanner n=new Scanner(System.in);
		System.out.println("enter mounth of the year:");

		int month=n.nextInt();
		if (month<0 || month>12) {
			System.out.println("wrong input");
		}
		if(month==1 || month==2 || month==3) {
			System.out.println("Spring");
		}else if(month==4 || month==5 || month==6) {
			System.out.println("Sssss");
		}else if(month==7 || month==8 || month==9) {
			System.out.println("fff");
		}else if(month==10 || month==11 || month==12) {
			System.out.println("wwww");
			System.out.println("I like this season");
		}
		String gender="male";
		switch(gender) {
		case "male":
			System.out.println("gender is male");
		}



	}

}
