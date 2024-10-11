package problem;

import java.util.Scanner;

public class SumofSquaresofDigits {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number: ");
		int num=sc.nextInt();
		int sum=0;
		while(num>0) {
			int remainder= num%10;
			sum=sum+(remainder*remainder);
			num/=10;
		}
		
		System.out.println(sum);

	}

}
