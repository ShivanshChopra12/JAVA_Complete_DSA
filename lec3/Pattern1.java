package lec3;

public class Pattern1 {

	public static void main(String[] args) {
		int n = 5;
		int total_star = n;
		int row = 1;

		while (row <= n) {
			int count_star = 1;
			while (count_star <= total_star) {
				System.out.print("*");
				count_star++;
			}
			System.out.println();
			row++;
		}
	}

}
