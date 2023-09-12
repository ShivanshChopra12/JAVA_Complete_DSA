package assignment;

import java.util.Scanner;

public class DecimalToOctal {
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		long decimal = scn.nextLong();
		long octal = 0;
		int n = 0;
		int i = 1;
		while (decimal > 0) {
			long rem = decimal % 8;
			octal = (long) (octal + i * rem);
			i=i*10;
			decimal = decimal / 8;

		}
		System.out.print(octal);
	}
}
