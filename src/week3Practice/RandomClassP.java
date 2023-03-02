package week3Practice;

import java.util.Scanner;

public class RandomClassP {

	public static void main(String[] args) {
		Scanner n=new Scanner(System.in);
		System.out.println("enter 4numbers: ");
		int n1=n.nextInt();
		int n2=n.nextInt();
		int n3=n.nextInt();
		int n4=n.nextInt();
		if(n1>n2) {
			System.out.println("n1 is bigger");
		}if(n2>n3) {
			System.out.println("n2 is bigger");
		}if(n3>n4) {
			System.out.println("n3 is bigger");
		}if(n4>n3) {
			System.out.println("n4 is bigger");
		}else {
			System.out.println("all are equal1");
		}
 

	}

}
