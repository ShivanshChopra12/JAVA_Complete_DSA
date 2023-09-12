package assignment;

import java.util.*;

// num= 22, prime_fac= 2 * 11, 
// sum of prime_fact_digits => 2+1+1=4
//sum of num_digits= 2+2=4
//num_digits == prime_fact_digits , then it is a boston no.

public class BostonNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
	//	System.out.println(PrimeFacSum(num));
		if (PrimeFacDigSum(num) == SumOfDigits(num)) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}
	}

	public static int PrimeFacDigSum(int num) {
		int sum = 0;
		for (int div = 2; div <= num; div++) {
			while (num % div == 0) {
				num = num / div;
				int ans = SumOfDigits(div);
				sum = sum + ans;
			}
		}
		return sum;
	}

	public static int SumOfDigits(int num) {

		int sum = 0;
		while (num > 0) {
			int digit = num % 10;
			sum = sum + digit;
			num = num / 10;
		}
		return sum;
	}
}
