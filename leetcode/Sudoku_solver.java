package leetcode;

public class Sudoku_solver{
	    public void solveSudoku(char[][] board) {
	        solve(board,0,0);
	    }
	     boolean ans =false;

			public void solve(char board[][], int row, int col	) {

			if (row == board.length) {
	            ans=true;
				return;
			}

			if (board[row][col] == '.') {
				for (int i = 1; i <= 9; i++) {
					if (check(board, row, col, (char) ('0'+i))) {
						board[row][col] = (char) ('0'+i);

						if (col < board[0].length - 1) {
							solve(board, row, col + 1);
						} else {
							solve(board, row + 1, 0);
						}

						if (ans==false){board[row][col] = '.';}
					}
				}
			} else {
				if (col < board[0].length - 1) {
					solve(board, row, col + 1);
				} else {
					solve(board, row + 1, 0);
				}
			}

		}


		public static boolean check(char board[][], int row, int col, char val) {
			// if exists in the same row
			for (int i = 0; i < board[0].length; i++) {
				if (board[row][i] == val) {
					return false;
				}
			}

			// if exists in the same col
			for (int j = 0; j < board.length; j++) {
				if (board[j][col] == val) {
					return false;
				}
			}

			// within the same block
			int row_s = row - row % 3;
			int col_s = col - col % 3;
			for (int i = row_s; i < row_s + 3; i++) {
				for (int j = col_s; j < col_s + 3; j++) {
					if (board[i][j] == val) {
						return false;
					}
				}

			}
			return true;
		}
	}
