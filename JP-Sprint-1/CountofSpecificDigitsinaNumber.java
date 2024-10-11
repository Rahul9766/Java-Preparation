package problem;

import java.util.*;
import java.util.Scanner;

public class CountofSpecificDigitsinaNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number: ");
		int num=sc.nextInt();
		Map <Integer , Integer> digits= new HashMap<>();
		while(num>0) {
			int remainder= num%10;
			digits.put(remainder,0);
			num/=10;
		}
		System.out.println(digits.size());
		

	}

}
