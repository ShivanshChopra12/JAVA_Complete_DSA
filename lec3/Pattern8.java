package lec3;

public class Pattern8 {
	public static void main(String[] args) {
		int n = 5;
		int row = 0;
		int total_star = n;
		
//step1
		while (row < n) {

			// step2
			
			int count_star = 0;
			while (count_star < total_star) {
				if(count_star+row==n-1|| count_star==row)
				{System.out.print(" * ");}
				else {
					System.out.print("   ");
				}
				count_star++;
			}

			System.out.println();
			row++;
		}

	}

}
