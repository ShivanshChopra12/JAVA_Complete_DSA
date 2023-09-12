package assignment;

import java.util.*;

public class Basic_calculator {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		char ch;

		while (true) {
			ch = sc.next().charAt(0);
			if (ch == '+') {
				long N1 = sc.nextLong();
				long N2 = sc.nextLong();
				System.out.println(N1 + N2);
			} else if (ch == '-') {
				long N1 = sc.nextLong();
				long N2 = sc.nextLong();
				System.out.println(N1 - N2);
			} else if (ch == '*') {
				long N1 = sc.nextLong();
				long N2 = sc.nextLong();
				System.out.println(N1 * N2);
			} else if (ch == '/') {
				long N1 = sc.nextLong();
				long N2 = sc.nextLong();
				System.out.println(N1 / N2);
			} else if (ch == '%') {
				long N1 = sc.nextLong();
				long N2 = sc.nextLong();
				System.out.println(N1 % N2);
			} else if (ch == 'X' || ch == 'x') {
				System.exit(0);
			} else {
				System.out.println("Invalid operation. Try again.");
			}
		}
	}
}