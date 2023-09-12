package assignment;

import java.util.Scanner;

public class Shopping_Game {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t > 0) {

			t--;

			int A_aukaat = sc.nextInt();
			int H_aukaat = sc.nextInt();

			int phone = 1;
			int A = 0;
			int H = 0;

			while (true) {
				// A
				A = A + phone;
				if (A > A_aukaat) {
					System.out.println("Harshit");
					break;
				}
				phone++;

				// H
				H = H + phone;
				if (H > H_aukaat) {
					System.out.println("Aayush");
					break;
				}
				phone++;
			}
		}
	}
}