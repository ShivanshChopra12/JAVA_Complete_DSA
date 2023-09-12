package assignment;

import java.util.*;

public class PrintPrime {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		for (int i = 2; i <=N; i++) {
			if (checkPrime(i)) {
				System.out.println(i);
			}
		}
	}

	static boolean checkPrime(int i) {

		int divisor = 1;
		int num_Fac = 0;

		while (divisor <= i) {
			int rem = i % divisor;

			if (rem == 0) {
				num_Fac++;
			}
			divisor++;
		}

		if (num_Fac == 2) {
			return true;
		} else {
			return false;
		}

	}

}
