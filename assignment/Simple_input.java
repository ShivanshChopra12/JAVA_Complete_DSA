package assignment;

import java.util.Scanner;

public class Simple_input {

	public static void main(String[] args) {
		Scanner q = new Scanner(System.in);
		int sum = 0;

		while (true) {
			int x = q.nextInt();
			sum = sum + x;

			if (sum >= 0) {
				System.out.println(x);
			}
			if (sum < 0) {break;
			}
			

		}
	}
}
