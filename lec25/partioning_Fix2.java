package lec25;

import java.util.ArrayList;
import java.util.List;

public class partioning_Fix2 {

	public static void main(String[] args) {
		List<String> AL_bag = new ArrayList<>();
		kaat("abc", "", AL_bag);

	}

	public static void kaat(String table, String bag, List<String> AL_bag) {
		// table=abc

		if (table.isEmpty()) {
			System.out.println(bag);
			System.out.println(AL_bag);
			System.out.println("==========================");
		}

		for (int chakku = 1; chakku <= table.length(); chakku++) {
			String piece = table.substring(0, chakku);// a
			String remain = table.substring(chakku);// bc
//				System.out.println(chakku+" "+piece + "--" + remain);
			// fix2:
			if (isPalindrome(piece)) { //palindromic partitions 
				AL_bag.add(piece);
				kaat(remain, bag + piece + "-", AL_bag);
				AL_bag.remove(AL_bag.size() - 1); // explicit backtracking
			}
		}
	}

	public static boolean isPalindrome(String piece) {
		int start = 0;
		int end = piece.length() - 1;

		while (start < end) {

			if (piece.charAt(start) != piece.charAt(end)) {
				return false;
			}
			start++; 
			end--;
		}
		return true;
	}

}