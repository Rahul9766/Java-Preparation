package problem;

import java.util.Scanner;

public class PascalTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Row: ");
		int num=sc.nextInt();
		
		for(int i=0;i<num;i++) {
			for(int j=0;j<=i;j++) {
				if(j==0 || j==i) {
					System.out.print(1);
				}
				else
					System.out.print(i);
			}
			System.out.println();
		}
		
		
	}

}
