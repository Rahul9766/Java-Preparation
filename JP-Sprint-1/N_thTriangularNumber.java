package problem;

import java.util.Scanner;

public class N_thTriangularNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number: ");
		int num=sc.nextInt();
		int sum=0;
		for(int i=1;i<=num;i++) {
			sum+=i;
		}
		
		System.out.println(sum);

	}

}
