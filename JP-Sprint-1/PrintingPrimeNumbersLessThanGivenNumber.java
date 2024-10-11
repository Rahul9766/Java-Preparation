package newPAck;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrintingPrimeNumbersLessThanGivenNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter  Number: ");
		int num = sc.nextInt();
		List<Integer> result=new ArrayList <> ();
		
		
		for(int i=0;i<num;i++) {
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
			
			if(flag) result.add(i);
			
		}
		
		System.out.println(result);

	}

}
