package assignment;

import java.util.Scanner;

public class BinaryToDecimal {
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		long binary = scn.nextLong();
		long decimal = 0;
		int n = 0;
		while (true) {
			if (binary == 0) {
				break;
			} else {
				long temp = binary % 10;
				decimal = (long) (decimal + temp * Math.pow(2, n));
				binary = binary / 10;
				n++;
			}
		}
		System.out.print(decimal);
	}
}
