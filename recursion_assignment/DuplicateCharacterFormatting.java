package recursion_assignment;

import java.util.*;

public class DuplicateCharacterFormatting {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String str1 = sc.next();
		System.out.println(duplet(0, 1, new StringBuilder(str1)));
	}

	public static StringBuilder duplet(int i, int j, StringBuilder sb) {
		if (j == sb.length()) {
			return sb;
		}
		if (sb.charAt(i) == sb.charAt(j)) {
			sb = sb.insert(i + 1, '*');
		}
		return duplet(i + 1, j + 1, sb);
	}

}
