package Lec_DP;

public class Edit_Distance {

	public static void main(String[] args) {
		System.out.println(ed("SATURDAY", "SUNDAY", 8, 6));
		System.out.println(edTD("SATURDAY", "SUNDAY", 8, 6, new Integer[8 + 10][6 + 10]));
		System.out.println(edBU("SATURDAY", "SUNDAY", 8, 6));

	}

	public static int ed(String s1, String s2, int m, int n) {
//phli string ko dusri string ki tarah bnana hai (delete, insert ,replace) min operations
		if (m == 0) {
			return n;
		}
		if (n == 0) {
			return m;
		}
		if (s1.charAt(m - 1) == s2.charAt(n - 1)) {
			return ed(s1, s2, m - 1, n - 1);
		} else {
			return 1 + Math.min(ed(s1, s2, m, n - 1	), // delete in s2
					Math.min(ed(s1, s2, m - 1, n), // insert in s2
							ed(s1, s2, m - 1, n - 1))); // replace in s2
		}

	}

	public static int edTD(String s1, String s2, int m, int n, Integer dp[][]) {
		if (m == 0) {
			return n;
		}
		if (n == 0) {
			return m;
		}

		if (dp[m][n] != null) {
			return dp[m][n];
		}

		if (s1.charAt(m - 1) == s2.charAt(n - 1)) {
			dp[m][n] = edTD(s1, s2, m - 1, n - 1, dp);
		} else {
			dp[m][n] = 1 + Math.min(edTD(s1, s2, m, n - 1, dp), // delete in s2
					Math.min(edTD(s1, s2, m - 1, n, dp), // insert in s2
							edTD(s1, s2, m - 1, n - 1, dp))); // replace in s2
		}
		return dp[m][n];

	}

	public static int edBU(String s1, String s2, int m, int n) {
		int dp[][] = new int[m + 100][n + 100];

		//n=0
		for(int i =0 ;i<=m;i++) {
			dp[i][0]=i;
		}
		
		//m=0
		for(int j =0 ;j<=n;j++) {
			dp[0][j]=j;
		}

		for (int i = 1; i <= m; i++) {
			for (int j = 1; j <= n; j++) {
				if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
					dp[i][j] = dp[i - 1][j - 1];
				}
				else {
					dp[i][j] = 1 + Math.min(dp[i][j - 1], 
							Math.min(dp[i - 1][j], 
							dp[i - 1][j - 1]));				}
			}
		}
		
		return dp[m][n];	
	}
}
