package java_beginners_code;

import java.util.Scanner;

public class SwitchCaSE {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the amount");
		int num=sc.nextInt();
		switch(num) {
		case 1:
			System.out.println("AMOUNT IS RS:"+num);
			break;
		case 2:
		System.out.println("AMOUNT IS RS:"+num);
		break;
		case 3:
			System.out.println("AMOUNT IS RS:"+num);
			break;
		case 4:
			System.out.println("AMOUNT IS RS:"+num);
			default:
				System.out.println("INVALID AMOUNT:");
		}

	}

}
