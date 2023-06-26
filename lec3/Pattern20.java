package lec3;

public class Pattern20 {
	public static void main(String[] args) {

		int row = 1;
		int n = 3;
		int total_star = 1;
		int total_space = 3;

		while (row <= 2 * n + 1) {

			int count_space = 0;
			while (count_space < total_space) {
				System.out.print(" ");
				count_space++;
			}

			int count_star = 0;
			while (count_star < total_star) {
				if (count_star == 0 || count_star == total_star - 1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
				count_star++;
			}

			if (row < n + 1) {
				total_space--;
				total_star = total_star + 2;
			} else {
				total_space++;
				total_star = total_star - 2;
			}
			System.out.println();
			row++;
		}

	}
}
