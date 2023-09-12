package assignment;

import java.util.Scanner;

public class Hollow_rhombus {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row = 1;
		int total_star = n;
		int total_space = n - 1;

		while (row <= n) {
			int count_sp = 0;
			while (count_sp < total_space) {
				System.out.print(" ");
				count_sp++;
			}
			int count_star = 0;
			while (count_star < total_star) {
				if (row == 1 || row == n || count_star == 0 || count_star == n - 1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
				count_star++;
			}
			row++;
			total_space--;
			System.out.println();
		}
	}

}
