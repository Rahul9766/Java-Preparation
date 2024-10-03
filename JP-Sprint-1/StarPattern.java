package newPAck;

import java.util.Scanner;

public class StarPattern {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Pattern: ");
		String p = sc.nextLine();
		System.out.print("Enter number: ");
		int n = sc.nextInt();
		if (p.equals("pyramid")) {
			for (int i = 0; i < n; i++) {
				for (int j = n - 1; j >= i; j--) {
					System.out.printf(" ");
				}
				for (int j = 0; j <= i; j++) {
					System.out.printf("*");
				}
				for (int j = 1; j <= i; j++) {
					System.out.printf("*");
				}

				System.out.println();
			}

		}
		if (p.equals("diamond")) {
			for (int i = 0; i < n; i++) {
				for (int j = n - 1; j >= i; j--) {
					System.out.printf(" ");
				}
				for (int j = 0; j <= i; j++) {
					System.out.printf("*");
				}
				for (int j = 1; j <= i; j++) {
					System.out.printf("*");
				}

				System.out.println();
			}

			for (int i = 1; i < n; i++) {
				for (int j = 0; j <= i; j++) {
					System.out.printf(" ");
				}
				for (int j = n - 1; j >= i; j--) {
					System.out.printf("*");
				}
				for (int j = n - 2; j >= i; j--) {
					System.out.printf("*");
				}

				System.out.println();
			}

		}

	}

}
