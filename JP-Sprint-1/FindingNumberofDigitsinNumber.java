package newPAck;

import java.util.Scanner;

public class FindingNumberofDigitsinNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number: ");
		int num = sc.nextInt();
		int count=0;
//		System.out.println(Integer.toString(num).length());
		while(num>0) {
			count+=1;
			num=num/10;
		}
		System.out.println(count);

	}

}
