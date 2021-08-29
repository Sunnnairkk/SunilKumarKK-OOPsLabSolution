package com.greatlearning.lab1OOPs;

import java.util.Scanner;

public class Lab1OOPs {

	public static void main(String args[]) {
		
		Scanner in = new Scanner(System.in);
		int i = -1;
		String deprt="";
		String fName, lName;
		
		do {
			System.out.println("1. Technical");
			System.out.println("2. Admin");
			System.out.println("3. Human Resource");
			System.out.println("4. Legal");
			System.out.println("0. Exit");
			
			i = in.nextInt();
			
			switch (i) {
			case 1 : deprt = "tech"; break;
			case 2 : deprt = "admin"; break;
			case 3 : deprt = "hr"; break;
			case 4 : deprt = "legal"; break;
			default : continue;
			}
			
			System.out.println("Enter First Name : ");
			fName=in.next();
			System.out.println("Enter Last Name : ");
			lName=in.next();
			
			Employee emp = new Employee(fName,lName);
			emp.setdeprt(deprt);
			emp.showCredentials();
			
			
		} while (i != 0);
		in.close();
		System.out.println("Exited\n\n");
	}

}
