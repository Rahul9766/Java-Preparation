package newPAck;

import java.util.Scanner;

public class SumofEvenNumbers {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);

		System.out.print("Enter first Number: ");
		int fnum = sc.nextInt();
		System.out.print("Enter second Number: ");
		int snum=sc.nextInt();
		int sum=0;
		for(int i=fnum;i<=snum;i++) {
			if(i%2==0) sum+=i;
		}
		System.out.println("Sum of even number between range "+fnum+" to "+snum+" is "+ sum);

	}

}
