package leetcode;

public class CountDigitOne {

	public static void main(String[] args) {
		System.out.println(solve(13, 0));
	}

	public static int solve(int n, int ans) {

//		BP: 13 :(1),(1)0,(1)(1),(1)2,(1)3
//		SP:	12

		int temp = n;
		int count = 0;

		if (n == 0) {
			return ans;
		}

		while (temp > 0) {
			int digit = temp % 10;
			if (digit == 1) {
				count++;
			}
			temp = temp / 10;
		}

		return solve(n - 1, ans + count);

	}
}
