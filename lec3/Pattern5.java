package lec3;

public class Pattern5 {

	public static void main(String[] args) {
	int n=5;
		int row =1;
		int total_space=0;
		int total_star=n;
	
	
	while(row<=n) {
		
		int count_space=0;
		while (count_space < total_space) {
			System.out.print(" ");
			count_space++;
		}
		
		int count_star=0;
		while(count_star<total_star) {
			System.out.print("*");
			count_star++;
		}

		total_space++;
		total_star--;
		System.out.println();
		row++;
	}
	
	}

}
