package newPAck;

import java.util.Scanner;

public class FibonacciNumberAtSpecificPosition {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Number: ");
		int num = sc.nextInt();
		
		int fnum=0;
		int snum=1;
		for(int i=2; i<=num;i++) {
			int tnum=fnum + snum;
			fnum=snum;
			snum=tnum;
			
			if(i== num) {
				System.out.println("The Fibonacci number at position "+num+" is "+snum);
				break;
			}
			
		}
		if(num==1)System.out.println("The Fibonacci number at position "+num+" is "+1);
		if(num==0)System.out.println("The Fibonacci number at position "+num+" is "+0);
	}

}
