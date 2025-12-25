package com.tnsif.packagesandaccessmodifiers;

import java.util.Scanner;

public class Scannerclassexample {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter College Name: ");
		String cname = sc.nextLine();
		
		
		System.out.println("Enter Couselling Code: ");
		int code = sc.nextInt();
		
		System.out.println("The College name is: " + cname +", The College code is: "+code);

	}

}