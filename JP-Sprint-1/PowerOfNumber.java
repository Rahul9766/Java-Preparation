package problem;

import java.util.Scanner;

public class PowerOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number: ");
		int num=sc.nextInt();
		System.out.println("Enter Power: ");
		int power=sc.nextInt();
		
		System.out.print(num+" Power "+power+" is "+(int)Math.pow(num, power));

	}

}
