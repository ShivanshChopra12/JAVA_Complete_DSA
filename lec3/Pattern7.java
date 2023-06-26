package lec3;

public class Pattern7 {
	public static void main(String[] args) {
		int n = 5;
		int row = 1;
		int total_star = n;
		
//step1
		while (row <= n) {

			// step2
			
			int count_star = 0;
			while (count_star < total_star) {
				if(count_star==0||count_star==n-1||row==1||row==n)
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
