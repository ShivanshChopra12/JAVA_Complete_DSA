package assignment;

import java.util.*;

public class ReplaceThemAll {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();

		System.out.println(Change0to5(N));
	}

	public static long Change0to5(long N) {
		if (N == 0) 
			return 5;
	
		else {
			long temp = 0;
			while (N > 0) {
				long digit = N % 10;
				if (digit == 0) 
					digit = 5;
				
				temp = temp * 10 + digit;
				N = N / 10;
			}
		return reverse(temp);
		}
	}

	public static long reverse(long N) {
		long ans = 0;
		while (N > 0) {
			long rem = N % 10;
			ans = ans * 10 + rem;
			N = N / 10;
		}
		return ans;
	}

}
