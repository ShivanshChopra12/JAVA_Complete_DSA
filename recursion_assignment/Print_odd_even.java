package recursion_assignment;

import java.util.Scanner;

public class Print_odd_even {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		PO(n);
		PE(2, n);
	}

	public static void PO(int n) {
		if (n < 1) {
			return;
		}
		if (n % 2 != 0) {
			System.out.println(n);
			PO(n - 2);
		} else {
			PO(n - 1);
		}
	}

	public static void PE(int a, int n) {
		if (n < 1) {
			return;
		}

		if (a > n) {
			return;
		}
		System.out.println(a);
		PE(a + 2, n);
	}

}
