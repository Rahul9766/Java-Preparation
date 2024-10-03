package newPAck;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {

		boolean flag = false;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number: ");
		int n = sc.nextInt();

		if (n == 0 || n == 1)
			System.out.println("Not Prime");
		else {
			for (int i = 2; i < n; i++) {
				if (n % i == 0) {
					flag = true;
					break;
				}

			}
			if (flag)
				System.out.print("Not Prime Number");
			else
				System.out.print("Prime Number");
		}

	}

}
