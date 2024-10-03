package newPAck;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number: ");
		int n = sc.nextInt();
		int factorial = n;
		for (int i = 1; i < n; i++) {
			factorial *= i;
		}

		System.out.println("Factorial of " + n + " is " + factorial);
	}

}
