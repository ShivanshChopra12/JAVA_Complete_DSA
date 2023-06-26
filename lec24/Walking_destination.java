package lec24;

public class Walking_destination {

	public static void main(String[] args) {
		Solve(0, 0, "", 2, 2);
	}

	public static void Solve(int row, int col, String path, int Trows, int Tcols) {
		if (row == Trows && col == Tcols) {
			System.out.println(path);
			return;
		}

//		also we can do this
//		if (row>Trows|| c> Tcols){
//		return;}
		
		if (row < Trows) {
			Solve(row + 1, col, path + "D", Trows, Tcols);
		}
		if (col < Tcols) {
			Solve(row, col + 1, path + "R", Trows, Tcols);
		}
	}
}
