package lec6;

import java.util.Scanner;

public class F_to_C {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int minF = sc.nextInt();
		int max_F = sc.nextInt();
		int step = sc.nextInt();

		int F = minF;
		while (F <= max_F) {
			// int C=(int) ((5.0/9)*(F-32));
			int C = 5 * (F - 32) / 9;

			System.out.println(F + "\t" + C);

			F = F + step;
		}

	}

}
