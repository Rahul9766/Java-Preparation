package newPAck;

import java.util.Scanner;

public class SumPrimeFactorsofNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number: ");
		int n = sc.nextInt();
		int sum=0;
		for(int i=2;i<n;i++) {

			if(n%i==0) {
				boolean flag=true;
				if(i==1 || i==0) flag=false;
				
				else {
					for(int j=2;j<i;j++) {
						if(i%j==0) {
							flag=false;
							break;
						}
					}
				}
				
				if(flag) sum+=i;
				
			}
		}
		System.out.println(sum);

	}

}
