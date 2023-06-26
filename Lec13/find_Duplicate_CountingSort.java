package Lec13;

import java.util.Arrays;

import Array_Assignment.count;

public class find_Duplicate_CountingSort {

	public static void main(String[] args) {
		int[] arr = { 1, 3, 4, 2, 1 };

		System.out.println(findDuplicates(arr));

	}

	private static int findDuplicates(int[] arr) {
		int count[] = new int[arr.length];
		int idx;
		for (idx = 0; idx < arr.length; idx++) {
			count[arr[idx]]++;
		}

		System.out.println(Arrays.toString(count));
		for (idx = 0; idx < arr.length; idx++) {
			if (count[idx] > 1) {
				System.out.println(idx);
				return idx;
			}
		}
		return -1;
	}
}