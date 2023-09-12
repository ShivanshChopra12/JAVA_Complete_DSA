package assignment;

import java.util.Scanner;

public class InverseNumber {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();

		int ans = 0;
		int place = 1;
		while (number != 0) {
			int rem = number % 10;
			ans = (int) (ans + place * Math.pow(10, rem - 1));
			number = number / 10;
			place++;
		}
		System.out.println(ans);
	}
}
