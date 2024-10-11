package newPAck;

import java.util.Scanner;

public class NarcissisticNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number: ");
		int num = sc.nextInt();
//		int count=0;
		int temp=num;
		int result=0;
		int count= Integer.toString(num).length();
//		while(temp>0) {
//			count+=1;
//			temp=temp/10;
//		}
//		temp=num;
		while(temp>0) {
			int remainder = temp%10;
			result+=(int)Math.pow(remainder, count);
			temp/=10;
		}
		if(num==result) 
			System.out.println(num+" is a narcissistic number");
		else
			System.out.println(num+" is not a narcissistic number");
	}

}
