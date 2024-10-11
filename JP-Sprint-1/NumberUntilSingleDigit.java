package problem;

import java.util.Scanner;

public class NumberUntilSingleDigit {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number: ");
		int num=sc.nextInt();
		int result=0;
		while(num >= 10) {
			int remainder= num%10;
			result+=remainder;
			num/=10;
//			
//			if (num < 10) {
//				num += result;
//				result = 0;
//			}

		}
		
		
		System.out.println(result + num);

	}

}






