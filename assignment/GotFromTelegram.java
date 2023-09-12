package assignment;

import java.util.Scanner;

public class GotFromTelegram {

	public static char decodeString(String s, int k) {
		StringBuilder decodedString = new StringBuilder();

		for (char ch : s.toCharArray()) {
			if (Character.isLetter(ch)) {
				decodedString.append(ch);
			} else if (Character.isDigit(ch)) {
				int repeat = Character.getNumericValue(ch);
				String temp = decodedString.toString();
				for (int i = 1; i < repeat; i++) {
					decodedString.append(temp);
				}
			}
		}

		return decodedString.charAt(k - 1);
	}

	public static void main(String[] args) {
		Scanner SC = new Scanner(System.in);
		String encodedString = SC.nextLine();
		int kValue = SC.nextInt();
		char result = decodeString(encodedString, kValue);
		System.out.println(result);
	}
}
