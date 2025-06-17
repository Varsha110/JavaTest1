
//Find the sum of digits of a given number
import java.util.Scanner;

public class P3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		String num = sc.nextLine();

		sum(num);

	}

	public static void sum(String num) {
		char[] add = num.toCharArray();
		int addition = 0;

		for (int i = 0; i < add.length; i++) {
			int number = add[i]-'0'; // Converts digit character to integer value
			addition = number + addition;
		}

		System.out.println("Addition is : " + addition);
	}

}
