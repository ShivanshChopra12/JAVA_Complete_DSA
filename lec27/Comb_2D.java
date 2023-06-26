package lec27;

public class Comb_2D {

	public static void main(String[] args) {
		solve(0,0,2,"",2,2);
	}

	public static void solve(int r, int c, int toPlace, String path, int total_R, int total_C) {

		if (toPlace == 0) { // +ve BC
			System.out.println(path);
			return;
		}
		
		if (c == total_C) {
			c = 0;
			r++;
		}

		if (r == total_R) { // -ve base case
			return;
		}

		//r,c
		solve(r,c+1, toPlace - 1, path + "Q{" + r+","+c+"}", total_R, total_C);
		solve(r,c+1, toPlace, path, total_R, total_C);
		

	}
}
