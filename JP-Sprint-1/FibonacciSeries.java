package newPAck;

import java.util.*;

public class FibonacciSeries {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number: ");
		int n = sc.nextInt();

		List<Integer> series = new ArrayList<>();
		int fnum = 0;
		int snum = 1;
		series.add(fnum);
		series.add(snum);

		for (int i = 2; i < n; i++) {
			int tnum = fnum + snum;
			series.add(tnum);
			fnum = snum;
			snum = tnum;

		}

		System.out.println(series);

	}

}
