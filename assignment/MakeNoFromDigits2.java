package assignment;

import java.util.Scanner;

public class MakeNoFromDigits2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long Num_of_dig = sc.nextInt();
		long Concat = 0;
		long t = (long) Math.pow(10, Num_of_dig);
		if (Num_of_dig >= 1 && Num_of_dig <= 12) {
			for (int i = 0; i < Num_of_dig; i++) {
				long digits = sc.nextInt();
					if (digits == 0) {
						t= t/10;
					} else {
						t= t/10;
						Concat = Concat + digits * t;
					}
				
			} 
		}
		System.out.println(Concat);
	}
}

