package recursion_assignment;

public class Recursion_Pattern_1 {

	public static void main(String[] args) {
		PP1(5);
	}

	public static void PP1(int n) {
		if (n < 1) {
			return;
		}

		PP1(n - 1);
		printPatternRowRec(n);
		System.out.println();
	}

	public static void printPatternRowRec(int n) {
		if (n < 1) {
			return;
		}
		
		System.out.print("*" + "\t");
		printPatternRowRec(n - 1);
		
	}
}
