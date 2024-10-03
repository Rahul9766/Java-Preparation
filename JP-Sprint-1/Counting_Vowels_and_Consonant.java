package newPAck;

import java.util.Scanner;

public class Counting_Vowels_and_Consonant {

	public static void main(String[] args) {
		String vowels = "aeiou";
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter String: ");
		String n = sc.nextLine();
		int vCount = 0;
		int cCount = 0;
		for (int i = 0; i < n.length(); i++) {
			if (Character.toString(n.charAt(i)) != " ") {
				boolean flag = false;
				for (int j = 0; j < vowels.length(); j++) {
					if (n.charAt(i) == vowels.charAt(j)) {
						flag = true;
					}

				}
				if (flag)
					vCount += 1;
				else
					cCount += 1;
			}

		}

		System.out.println(vCount);
		System.out.println(cCount);

	}

}
