package lec27;

public class NxN_Queens_Combination2D2 {

	public static void main(String[] args) {
		int n = 4;
		boolean[][] board = new boolean[n][n];
		solve(0, 0, n, "", board);
	}

	public static void solve(int r, int c, int toPlace, String path, boolean[][] board) {

		if (toPlace == 0) {
			System.out.println(path);
			display(board);
			System.out.println("=============");
			return;
		}

		if (c == board[0].length) {
			c = 0;
			r++;
		}
		if (r == board.length) {
			return;
		}

		if (isSafe(r, c, board)) {
			board[r][c] = true;
			solve(r, c + 1, toPlace - 1, path + "Q{" + r + "," + c + "}", board);
		}
		board[r][c] = false;
		solve(r, c + 1, toPlace, path, board);
	}

	public static boolean isSafe(int r, int c, boolean board[][]) {
		for (int C = 0; C < c; C++) {
			if (board[r][C]) {
				return false;
			}
		}
		for (int R = 0; R < r; R++) {
			if (board[R][c]) {
				return false;
			}
		}

		int R = r;
		int C = c;
		while (R >= 0 && C >= 0) {
			if (board[R][C]) {
				return false;
			}
			R--;
			C--;
		}

		R = r;
		C = c;
		while (R >= 0 && C < board[0].length) {
			if (board[R][C]) {
				return false;
			}
			R--;
			C++;
		}
		return true;
	}

	public static void display(boolean[][] board) {

		for (boolean[] row : board) {
			for (boolean ali : row) {
				if (ali) {
					System.out.print("Q");
				} else {
					System.out.print(".");
				}
			}
			System.out.println();
		}

	}
}
