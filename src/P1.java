// Write a program to print a multiplication table for a given number.

import java.util.Scanner;

public class P1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the num : ");
		int number = sc.nextInt();

		table(number);

	}

	public static void table(int num) {
		for (int i = 1; i <= 10; i++) {
			int mult = num * i;
			System.out.println(num + "*" + i + "=" + mult);
		}
	}

}
