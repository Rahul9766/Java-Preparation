package problem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SumOfPrimeNumbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First Number: ");
		int num=sc.nextInt();
		System.out.println("Enter Second Number: ");
		int num1=sc.nextInt();
		List <Integer> result = new ArrayList<>();
		int sum=0;
		for(int i=num;i<num1;i++) {
			if(i==0 || i==1) {
				continue;
			}
			else 
			{
				boolean flag =true;
				for(int j=2;j<i;j++) {
					if(i%j==0) {
						flag=false;
						break;
					}
				}
				if(flag) sum+=i;
				
			}
		}
		
		System.out.println(sum);

	}

}
