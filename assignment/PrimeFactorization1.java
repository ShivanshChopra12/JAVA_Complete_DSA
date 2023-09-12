package assignment;

import java.util.*;

public class PrimeFactorization1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

	/*	for (int div = 2; div <= num; div++) {
			while (num % div == 0) {
				num = num / div;
				System.out.print(div);
				System.out.print(" ");
			}
		}
		*/
	
		//optimized approach
		for (int div = 2; div*div <= num; div++) {
			while (num % div == 0) {
				num = num / div;
				System.out.print(div);
				System.out.print(" ");
			}
		}
		
		if(num != 1) {
			System.out.print(num);
		}
	}

}
