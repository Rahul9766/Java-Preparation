package newPAck;

import java.util.Scanner;

public class SummingDigit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number: ");
		int n = sc.nextInt();
		int temp = n;
		int sum = 0;
		while (temp > 0) {
			int remainder = temp % 10;
			sum += remainder;
			temp /= 10;
		}

		System.out.println("Summing Digits of a Number " + n + " is " + sum);

	}

}
