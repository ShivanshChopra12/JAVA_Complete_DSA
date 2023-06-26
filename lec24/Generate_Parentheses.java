package lec24;

import java.util.ArrayList;

public class Generate_Parentheses {
	public static void main(String[] args) {
		Solve(3, 3, "");
	}

	public static void Solve(int op, int cl, String path) {
		if (op == 0 && cl == 0) {
			System.out.println(path);
			return;
		}

		if(op>cl) {
			return;
		}
		
		if (op > 0) {
			Solve(op - 1, cl, path + "(");
		}
		if (cl > 0) {
			Solve(op, cl - 1, path + ")");
		}
	}
}
