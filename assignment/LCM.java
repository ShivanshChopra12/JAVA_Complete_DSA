package assignment;

import java.util.Scanner;

public class LCM {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int lcm = 0;
		int i;
		for (i = 1; i <= a * b; i++) {
			if (i % a == 0 && i % b == 0) {
				break;
			}
		}
		lcm = i;
		System.out.println(lcm);
	}

}
