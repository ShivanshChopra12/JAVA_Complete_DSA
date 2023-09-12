package assignment;

import java.util.Scanner;

public class CountDigits {

	public static void main(String[] args) {

		Scanner q = new Scanner(System.in);
		int num = q.nextInt();// 522342
		int digit = q.nextInt();// 2
		int n = TotalDig(num, digit);
		System.out.println(n);
	}

	public static int TotalDig(int num, int digit) {
		int count = 0;
		while (num != 0) {
			int n = num % 10;
			if (n == digit) {
				count++;
			}
			num = num / 10;
		}
		return count;
	}
}
