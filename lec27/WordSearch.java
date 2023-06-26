	package lec27;
	
	public class WordSearch {
	
		public boolean exist(char[][] board, String word) {
	
			for (int r = 0; r < board.length; r++) {
				for (int c = 0; c < board[0].length; c++) {
					if (board[r][c] == word.charAt(0)) {
						if (exist(r, c, word, board)) {
							return true;
						}
					}
				}
			}
	
			return false;
	
		}
	
		public boolean exist(int r, int c, String word, char[][] board) {
			
			if(word.isEmpty()) { //ye phle ayega bcz agr word 0 hai toh aage nhi jana hai
				return true;
			}
			
			if (r < 0 || c < 0 || r == board.length || c == board[0].length||
					board[r][c]!=word.charAt(0)||board[r][c]=='.') {
				return false;
			}
	
			
			String remain = word.substring(1);
			char prev=board[r][c];
			board[r][c]='.';
			
			boolean ans = false;
			ans = ans || exist(r - 1, c, remain, board) 
					|| exist(r + 1, c, remain, board) 
					|| exist(r, c - 1, remain, board)
					|| exist(r, c + 1, remain, board);
			board[r][c]=prev;
			return ans;
		}
	}
