package com.revygit.project;

import java.util.Scanner;

public class Sample {

	public static void main(String[] args) {
		register(new Scanner(System.in));
	}
	
	
	public static void register(Scanner scan) {
		System.out.println("please enter your username");
		String username = scan.nextLine();
		System.out.println("please enter your password");
		String pass= scan.nextLine();
		System.out.println("your information has been saved in our database :)");
		System.out.println("please login");
		System.out.println("enter username");
		String user2 = scan.nextLine();
		System.out.println("enter password");
		String pass2 = scan.nextLine();
		if(username.equals(user2)) {
			if(pass.equals(pass2)) {
				System.out.println("you have logged in");
				System.exit(0);
			}
		}
		System.out.println("something went wrong");
		
	}
}
