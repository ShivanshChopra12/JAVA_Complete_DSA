package lec3;

public class Pattern13 {

	public static void main(String[] args) {
		int n = 5;
		int row = 1;
		int total_star = 1;

		while (row <= 2 * n - 1) {

			int count_star = 0;
			while (count_star < total_star) {
				System.out.print("*");
				count_star++;
			}

			System.out.println();
				if (row < n) {
				total_star++;
			} else {
				total_star--;
			}
				row++;
		}
	}

}
