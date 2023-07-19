package Lec_DP;

public class longest_Common_Subsequence {

	public static void main(String[] args) {

		String s1 = "pmjghexybyrgzczy";
		String s2 = "hafcdqbgncrcbihkd";

		int m = s1.length();
		int n = s2.length();
		System.out.println(lcs(s1, s2, m, n));
		System.out.println(lcsTD(s1, s2, m, n, new Integer[m + 100][n + 100]));
		System.out.println(lcsBU(s1, s2, m, n));
	}

	public static int lcs(String s1, String s2, int m, int n) {

		if (m == 0 || n == 0) {
			return 0;
		}

		if (s1.charAt(m - 1) == s2.charAt(n - 1)) {
			int sp = lcs(s1, s2, m - 1, n - 1);
			return 1 + sp;
		} else {
			int sp1 = lcs(s1, s2, m - 1, n);
			int sp2 = lcs(s1, s2, m, n - 1);

			int ans = Math.max(sp1, sp2);
			return ans;
		}

	}

	public static int lcsTD(String s1, String s2, int m, int n, Integer[][] dp) {

		if (m == 0 || n == 0) {
			return 0;
		}

		if (s1.charAt(m - 1) == s2.charAt(n - 1)) {
			int sp = lcsTD(s1, s2, m - 1, n - 1, dp);
			return dp[m][n] = 1 + sp;
		} else {
			int sp1 = lcsTD(s1, s2, m - 1, n, dp);
			int sp2 = lcsTD(s1, s2, m, n - 1, dp);

			int ans = Math.max(sp1, sp2);
			return dp[m][n] = ans;
		}

	}

	public static int lcsBU(String s1, String s2, int m, int n) {

		int dp[][] = new int[m + 100][n + 100];

		for (int i = 0; i <= m; i++) {
			dp[i][0] = 0;
		}
		for (int j = 0; j <= n; j++) {
			dp[0][j] = 0;
		}

		for (int i = 1; i <= m; i++) {
			for (int j = 1; j <= n; j++) {
				if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
					dp[i][j] = 1+ dp[i-1][j-1] ;
				
				} else {
					
					int sp1 = dp[i - 1][j];
					int sp2 = dp[i][j-1];		
					dp[i][j] = Math.max(sp1, sp2);
				}
			}
		}
		return dp[m][n];
	}
}
