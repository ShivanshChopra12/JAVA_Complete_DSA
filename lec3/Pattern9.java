package lec3;

public class Pattern9 {

	public static void main(String[] args) {
		int n = 5;
		int total_star = 1;
		int total_space = n - 1;
		int row = 1;
		//step1
		while (row <= n) {

			// step2
			int count_space = 0;
			while (count_space < total_space) {
				System.out.print(" ");
				count_space++;
			}

			int count_star = 0;
			while (count_star < total_star) {
				System.out.print("*");
				count_star++;
			}

			System.out.println();
			row++;
			// step3 - table bnao
			total_space--;
			total_star = total_star + 2;

		}

	}

}
