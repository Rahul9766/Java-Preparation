package newPAck;

import java.util.Scanner;

public class SumoftheDigitsofFactorialNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number: ");
		int n = sc.nextInt();
		int factorial=1;
		int sum=0;
		for(int i=1;i<=n;i++) {
			factorial*=(int)i;
			
		}
		while(factorial>0) {
			int remainder = factorial%10;
			sum+=remainder;
			factorial/=10;
		}
		
		System.out.println(" The sum of the digits is "+sum);

	}

}
