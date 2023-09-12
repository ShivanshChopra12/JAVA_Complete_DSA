package assignment;

import java.util.Scanner;

public class OddEvenBackInDelhi {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int Num_Of_Cars = sc.nextInt();

		int car_num;
		int rem;

		for (int i = 1; i <= Num_Of_Cars; i++) {
			car_num = sc.nextInt();
			int EvenSum = 0;
			int OddSum = 0;
			while (car_num != 0) {
				rem = car_num % 10;
				if (rem % 2 == 0) {
					EvenSum = EvenSum + rem;
				} else {
					OddSum = OddSum + rem;
				}
				car_num = car_num / 10;
			}

			if (EvenSum % 4 == 0 || OddSum % 3 == 0) {
				System.out.println("Yes");
			}
			else {
				System.out.println("No");
			}
		}
	}
}
