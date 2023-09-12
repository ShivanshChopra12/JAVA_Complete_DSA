package assignment;

//In this question, you just have to invert the number for eg 9876 with 6789 
//but the twist is that you have to Subtract every digit from 9. 
//for example we have 9876 so its invert will be 6789 and when we subtract every digit from 9, 
//then we have 9-6 = 3, 9-7 = 2, 9-8 = 1 and 9-9 = 0.
//So the final number will be After subtracting and inverting 0123. This must be your output.
//But remember the inverted number must not contain the zero from starting, for eg.
//6789 the result will be, the inverted number will be 9876 and chewbecca number will be,
//after subtracting from 9 it will be 0123. this will not be accepted
//if you are getting zero from leading then don’t change that number.

import java.util.Scanner;

public class ChewbaccaNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long ans = 0;
		long mult = 1;

		while (n > 0) {
			long digit = n % 10;
			if (n != 9 && digit >= 5) {
				digit = 9 - digit;
			}
			ans = ans + digit * mult;
			mult = mult * 10;
			n = n / 10;
		}
		System.out.println(ans);

	}
}