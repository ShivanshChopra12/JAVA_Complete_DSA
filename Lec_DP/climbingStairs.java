package Lec_DP;

public class climbingStairs {

	public static void main(String[] args) {
	

	}

	public static int Climb(int n) {
		
		if(n<=1) {return 1;}
		
		int sp1 = Climb(n-1);
		int sp2 = Climb(n-2);
		
		return sp1+sp2;
	}
	
	public static int ClimbTD(int n, Integer[] dp) {
		if(n<=1) {return 1;}

		if(dp[n]!=null) {
			return dp[n];
		}
		int sp1 = ClimbTD(n-1,dp);
		int sp2 = ClimbTD(n-2,dp);
//		climb[n]=>dp[n]
		
		dp[n]=sp1+sp2;
		return sp1 + sp2;
		
	}
	
	public static int ClimbBU(int N) {
//		s5
		int[] dp = new int[N+100];
//		s4
		dp[1]=1;
		dp[0]=1;
//		s1
		for (int n =2 ;n<=N;n++) {
//		s2
			int sp1 = dp[n-1];
			int sp2 = dp[n-2];
			
			dp[n]=sp1+sp2;
		}
//		s3
		return dp[N];
		
	}

	
}
