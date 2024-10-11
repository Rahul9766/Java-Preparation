package newPAck;

import java.util.Scanner;

public class AllDivisorsofNumber {

	public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
			System.out.print("Enter Number: ");
			int n = sc.nextInt();
			
			
			for(int i=1;i<=n;i++) 
			{
				if(i==n) {
					System.out.print(i);
				}
				if(n%i==0 && i!=n ) System.out.print(i+", ");
				
			}

	}

}
