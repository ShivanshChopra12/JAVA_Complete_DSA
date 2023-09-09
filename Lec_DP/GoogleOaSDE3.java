package Lec_DP;

import java.util.Scanner;

// link -> https://docs.google.com/document/d/13ydHMmLXcvIbpvH-rn-9F3Oc4IiekKu8ItLr05HZRJI/edit

public class GoogleOaSDE3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int y = sc.nextInt();
		int x = sc.nextInt();
		int z = sc.nextInt();
		int b = sc.nextInt();

		int[] dp = new int[n + 1];

		dp[1] = 0;

		int i = 2;
		while (i <= n) {
			int v1 = dp[i - 1] + y;
			int v2 = Integer.MAX_VALUE;
			int v3 = Integer.MAX_VALUE;
			int v4 = Integer.MAX_VALUE;

			if (i % 7 == 0) {
				v2 = dp[i / 7] + x;
			}
			if (i % 3 == 0) {
				v3 = dp[i / 3] + z;
			}
			if (i % 5 == 0) {
				v4 = dp[i / 5] + b;
			}

			dp[i] = Math.min(v1, Math.min(v2, Math.min(v3, v4)));
			i++;
		}
		System.out.println(dp[n]);
	}
}
