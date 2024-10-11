package newPAck;

import java.util.Scanner;



public class FibonacciSequenceUsingRecursion {
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number: ");
		int n = sc.nextInt();
		
		
		for(int i=0;i<n;i++) {
			System.out.print(fibRec(i)+" , ");
		}

	}
	public static int fibRec(int n) {
		
		if(n==0) {
			return 0;
		}
		if(n==1 || n==2) {
			return 1;
		}
		
		
		return fibRec(n-1)+fibRec(n-2) ;
	}

	
}
