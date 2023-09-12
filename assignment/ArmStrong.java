package assignment;

import java.util.Scanner;

public class ArmStrong {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int a = num;
		int sum = 0;
		while (num > 0) {
			int rem = num % 10;
			sum = (int) (sum + Math.pow(rem, countDig(a)));
			num = num / 10;
		}
		System.out.println(sum==a);

	}

	public static int countDig(int n) {
		int count = 0;
		while (n != 0) {
			n = n / 10;
			count = count + 1;
		}
		return count;
	}

}
