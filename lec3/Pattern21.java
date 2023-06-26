package lec3;

public class Pattern21 {
	public static void main(String[] args) {

		int row = 1;
		int n = 5;
		int total_star = 1;

		int total_space = 7;

		while (row <= n) {

			int count_star = 0;
			while (count_star < total_star) {
				System.out.print("*");
				count_star++;
			}

			int count_space = 0;
			while (count_space < total_space) {
				System.out.print(" ");
				count_space++;
			}

			int count_star2 = 0;
			if (row == n) {
				count_star2 = 1;
			}
			while (count_star2 < total_star) {
				System.out.print("*");
				count_star2++;
			}

			row++;
			System.out.println();
			total_star++;
			total_space = total_space - 2;
			;

		}

	}
}
