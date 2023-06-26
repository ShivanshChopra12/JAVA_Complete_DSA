package lec3;

public class Patter19 {
	public static void main(String[] args) {

		int row = 1;
		int n = 15;
		int total_star = n + 1;
		int total_space = -1;

		while (row <= 2 * n + 1) {
			int count_star = 0;
			if(row==1) {count_star=1;}
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
			if(row==31) {count_star2=1;}
			while (count_star2 < total_star) {
				System.out.print("*");
				count_star2++;
			}

			if (row < n + 1) {
				total_space = total_space + 2;
				;
				total_star--;
			} else {
				total_star++;
				total_space = total_space - 2;
			}
			row++;
			System.out.println();

		}

	}
}
