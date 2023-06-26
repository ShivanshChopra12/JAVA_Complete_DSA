package lec3;

public class Pattern33 {

	public static void main(String[] args) {
		int n = 10;
		int total_star = 1;
		int total_space = n - 1;
		int row = 1;
		int Start_row_num = n;

		while (row <= n) {

			int count_space = 0;
			while (count_space < total_space) {
				System.out.print("  ");
				count_space++;
			}

			int num = Start_row_num;
			int count_star = 0;
			while (count_star < total_star) {
				if (num==10) {
					System.out.print("0 ");
				}else {
				System.out.print(num + " ");}
				if (count_star < total_star / 2) {
					num++;
				} else {
					num--;
				}
				count_star++;

			}

			
			row++;
			Start_row_num--;
			total_space--;
			total_star = total_star + 2;
			System.out.println();

		}

	}

}
