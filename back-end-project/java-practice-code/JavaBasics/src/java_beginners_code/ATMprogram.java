package java_beginners_code;

import java.util.Scanner;

public class ATMprogram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("press 1 for deposit");

		System.out.println("press 2 for withdrawal");

		System.out.println("press 3 for check balance");

		System.out.println("press 4 for exit");
		
		System.out.println("enter your choice");
		int choice = sc.nextInt();
		
		
		
		
		int bal = 1500;

		switch (choice) {
		case 1:
			
				System.out.println("enter your amount to be deposited");
				int dep = sc.nextInt();
				bal = bal + dep;
				System.out.println("Amount is deposited");
				break;
		case 2:
			System.out.println("enter your amount to be withdraw");
			int withwl = sc.nextInt();
			if (withwl<bal) {
			bal = bal-withwl;
			System.out.println("please collect your cash");
			System.out.println("Your current balance is:"+bal);
			break;
			}

		case 3:
				
				System.out.println("Your check balance amount" + bal);
				break;

		case 4:
			
				
				System.out.println("exited!!");
				break;
			}
		}

	}


