package lec3;
public class Pattern4 {

	public static void main(String[] args) {
		int n = 5;
		int total_star=1;
		int total_space=n-1;
		int row = 1;

		while (row <= n) {
			
			int count_space=0;
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
			total_space--;
			total_star++;
		
		}

	}

}
