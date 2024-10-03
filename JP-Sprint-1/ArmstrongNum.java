package newPAck;

import java.util.Scanner;

public class ArmstrongNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number: ");
		int n = sc.nextInt();
		int temp = n;
		int num = 0;
		while (temp > 0) {
			int remainder = temp % 10;
			num += remainder * remainder * remainder;
			temp = temp / 10;

		}

		if (n == num)
			System.out.println(n + " is Armstrong Number");
		else
			System.out.println(n + " is not Armstrong Number");

	}

}
