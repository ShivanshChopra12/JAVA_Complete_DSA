package assignment;

import java.util.*;

//printing unique prime factors
public class PrimeFactorization2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		for (int div = 2; div <= num; div++) {
			while (num % div == 0) {
				num = num / div;

				System.out.print(div);
				System.out.print(" ");
//awesomeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee part
				while (num % div == 0) {
					num = num / div;
				}

			}
		}

	}

}
