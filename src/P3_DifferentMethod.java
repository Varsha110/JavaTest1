//Que3: Find the sum of digits of a given number

import java.util.Scanner;

public class P3_DifferentMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the num : ");
		int num = sc.nextInt();

		sc.close();

		System.out.println(sumOfDigits(num));

	}

	public static int sumOfDigits(int num) {
		int add = 0;

		while (num > 0) {
			int rem = num % 10;
			add = add + rem;
			num = num / 10;
			System.out.println("New number  is : " + num);
		}
		return add;
	}

}
