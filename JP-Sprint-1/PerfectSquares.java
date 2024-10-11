package problem;

import java.util.Scanner;

public class PerfectSquares {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number: ");
		int num=sc.nextInt();
		
		for(int i=0;i<num;i++) {
			if(i*i == num) {
				System.out.println("Perfect Number");
				break;
			}
			if(i*i >num) {
				break;
			}
			
		}
		

	}

}
