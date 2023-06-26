package lec2;

import java.util.*;

public class Primeno {

	public static void main(String[] args) {
		Scanner q = new Scanner(System.in);
		int Q = q.nextInt();

		while (Q > 0) {
			int divisor = 1;
			int num_Fac = 0;
			int Num = q.nextInt();
			while (divisor <= Num) {

				int rem = Num % divisor;

				if (rem == 0) {
					num_Fac++;
				}
				divisor++;
			}

			if (num_Fac == 2) {
				System.out.println("Prime no.");
			} else {
				System.out.println("Not Prime");
			}

			Q--;
		}
	}

}
