package assignment;

import java.util.Scanner;

public class MakeNoFromDigits {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		long Num_of_dig = sc.nextInt();
		long Concat = 0;
		long t = 1;
		if (Num_of_dig >= 1 && Num_of_dig <= 12) {
			for (int i = 0; i < Num_of_dig; i++) {
				long digits = sc.nextInt();
					if (digits == 0) {
						t= t*10;
					} else {
						Concat = Concat + digits * t;
						t= t*10;
					}
				
			} 
		}
		System.out.println(Concat);
	}
}
