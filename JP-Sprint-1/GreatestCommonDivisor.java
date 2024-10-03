package newPAck;

import java.util.Scanner;

public class GreatestCommonDivisor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter First Number: ");
		int fnum = sc.nextInt();
		System.out.println();
		System.out.print("Enter Second Number: ");
		int snum = sc.nextInt();
		int range;
		if (fnum < snum)
			range = fnum;
		else
			range = snum;
		int gcd = 0;
		for (int i = 1; i <= range; i++) {
			if (fnum % i == 0 && snum % i == 0) {
				gcd = i;
			}

		}
		System.out.println(gcd);
	}

}
