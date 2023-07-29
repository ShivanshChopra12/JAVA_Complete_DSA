package Lec_DP;

import java.util.Scanner;

public class KnapSack_01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt(); // no. of items
		int MaxWeight = sc.nextInt(); // total capacity
		int val[] = new int[N];
		int wt[] = new int[N];

		for (int i = 0; i < N; i++) {
			wt[i] = sc.nextInt();
		}
		for (int i = 0; i < N; i++) {
			val[i] = sc.nextInt();
		}

		int n = wt.length;

		System.out.println(knapsack(MaxWeight, wt, val, n));
		System.out.println(knapsackTD(MaxWeight, wt, val, n, new Integer[MaxWeight + 10][n + 10]));
		System.out.println(knapsackBU(MaxWeight, wt, val, n));
	}

	public static int knapsack(int MWeight, int weights[], int values[], int n) {
		if (n == 0 || MWeight == 0) {
			return 0;
		}
		if (weights[n - 1] > MWeight) {
			int sp = knapsack(MWeight, weights, values, n - 1);
			return sp;
		} else {
			int sp1 = Math.max(knapsack(MWeight, weights, values, n - 1),
					values[n - 1] + knapsack(MWeight - weights[n - 1], weights, values, n - 1));
			return sp1;
		}
	}

	public static int knapsackTD(int MWeight, int weights[], int values[], int n, Integer dp[][]) {
		if (n == 0 || MWeight == 0) {
			return 0;
		}

		if (dp[MWeight][n] != null) {
			return dp[MWeight][n];
		}

		if (weights[n - 1] > MWeight) {
			dp[MWeight][n] = knapsackTD(MWeight, weights, values, n - 1, dp);
			return dp[MWeight][n];
		} else {
			dp[MWeight][n] = Math.max(knapsackTD(MWeight, weights, values, n - 1, dp),
					values[n - 1] + knapsackTD(MWeight - weights[n - 1], weights, values, n - 1, dp));
			return dp[MWeight][n];
		}
	}

	public static int knapsackBU(int MWeight, int weights[], int values[], int n) {
		int dp[][] = new int[MWeight + 10][n + 10];

		for (int i = 1; i <= MWeight; i++) {
			for (int j = 1; j <= n; j++) {
				if (weights[j - 1] > i) {
					dp[i][j] =   dp[i][j-1];
				} else {
					dp[i][j] = Math.max(dp[i][j-1],
							values[j - 1] + dp[i-weights[j-1]][j-1]);
				}
			}
		}
		return dp[MWeight][n];
	}
}
