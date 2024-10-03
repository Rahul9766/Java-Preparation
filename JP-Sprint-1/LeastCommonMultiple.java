package newPAck;

import java.util.Scanner;

public class LeastCommonMultiple {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter First Number: ");
		int fnum = sc.nextInt();
		System.out.println();
		System.out.print("Enter Second Number: ");
		int snum = sc.nextInt();
		int range = fnum * snum;
		int lcm = 0;
		for (int i = 1; i <= range; i++) {
			if (i % fnum == 0 && i % snum == 0) {
				lcm = i;

				break;
			}
		}
		System.out.println("LCM is " + lcm);
	}

}
