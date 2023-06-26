package lec3;

public class Pattern16 {

		public static void main(String[] args) {
			int n = 5;
			int row = 1;
			int total_star = 5;
			int total_space=n-1;

			while (row <= 2 * n - 1) {

				int count_space=0;
				while (count_space < total_space) {
					System.out.print("  ");
					count_space++;
				}
				
				int count_star = 0;
				while (count_star < total_star) {
					System.out.print(" *");
					count_star++;
				}

				
				System.out.println();
				
				if (row < n) {
					total_star--;
					total_space--;
				} else {
					total_star++;
					total_space=total_space+1;
				}
				row++;
			}
		}

	}
