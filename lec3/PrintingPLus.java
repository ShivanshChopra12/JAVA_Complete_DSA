package lec3;

public class PrintingPLus {

	public static void main(String[] args) {
		
		int n=5;
		int row=1;
		int total_star = n;
//		int total_space = 2;
		
		while(row<=n) {
			
//			int count_space=0;
//			while (count_space < total_space) {
//				
//				System.out.println(" ");
//				count_space++;
//			}
			
			int count_star = 0;
			while (count_star < total_star) {
				if(row==n/2+1) {
				System.out.print("*");}
				else {
					System.out.println(" ");
				}
				count_star++;
			}
			
			//System.out.println();
			System.out.println();
			row++;
			
		}
	}

}
