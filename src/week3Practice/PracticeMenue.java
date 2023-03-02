package week3Practice;

import java.util.Scanner;

public class PracticeMenue {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String userName = "nilofar";
		String pass = "wafi123";
		String userNameEntred = "";
		String passwordEntred = "";
		String firstName = "";
		String lastName = "";
		String email = "";
		System.out.println("1. login");
		System.out.println("2. creat acount");
		int op1 = sc.nextInt();
		if (op1 == 1) {
			System.out.println("login");
			System.out.println("please enter your pass:");
			pass = sc.nextLine();
			System.out.println("please enter your userName:");
			userName = sc.nextLine();
			if (userNameEntred.equals(userName)) {
				if (passwordEntred.equals(pass)) {
					System.out.println("user and pass is correct");

				} else {
					System.out.println("both wront");
				}
				int p2 = sc.nextInt();
				if (p2 == 2) {
					System.out.println("please prvide firstName:");
					firstName = sc.nextLine();
					System.out.println("please provid lastName:");
					lastName = sc.next();
					System.out.println("please provide email:");
					email = sc.nextLine();
					System.out.println("please provid pass");
					pass = sc.nextLine();
					System.out.println("confirm pass");
				
				passwordEntred = sc.nextLine();
				if (passwordEntred.equals(pass)) {
					System.out.println("acount created successfully");
				}else {
					System.out.println("wrong");
				}
				}}}}}
