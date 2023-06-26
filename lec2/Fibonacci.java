package lec2;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner q = new Scanner(System.in);
		int N = q.nextInt();

		int a = 0;
		int b = 1;
		int count = 1;
		int c = 0;
		while (count <= N) {

			c = a + b;
			a = b;
			b = c;

			count++;
		}
		System.out.println(a);

	}

}
