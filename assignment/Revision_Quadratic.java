package assignment;

import java.util.Scanner;

public class Revision_Quadratic {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		// eq ax^2 + bx + c = 0

		int d = (b * b) - (4 * a * c);

		int r1 = (int) (-b + Math.sqrt(d)) / 2 * a;
		int r2 = (int) (-b - Math.sqrt(d)) / 2 * a;
//		System.out.println(r1 + "-" + r2);
		int first, second;

		if (r1 > r2) {
			first = r2;
			second = r1;
		} else {
			first = r1;
			second = r2;
		}

		if (d > 0) {

			System.out.println("Real and Distinct");
			System.out.println(first + " " + second);
		}

		if (d == 0) {

			System.out.println("Real and Equal");
			System.out.println(first + " " + second);
		}
		if (d < 0) {
			System.out.println("Imaginary");
		}

	}

}
