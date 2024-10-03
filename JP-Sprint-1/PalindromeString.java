package newPAck;

import java.util.*;

public class PalindromeString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter String: ");
		String n = sc.nextLine();

		String rev_n = "";
		for (int i = n.length() - 1; i >= 0; i--) {
			rev_n += n.charAt(i);
		}

		if (n.equals(rev_n))
			System.out.println(n + "is Palindrome");
		else
			System.out.println("is not Palindrome");

	}

}
