package Lec13;

import java.util.Arrays;

public class selection_Sort {

	public static void main(String[] args) {
		int arr[] = { 56, 6, 44, 33, 22, 4, 3, 2, 1 };

		for (int i = 0; i < arr.length; i++) {
			int min = arr[i];
			int min_idx = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < min) {
					min = arr[j];
					min_idx = j;
				}
			}
		//swapping
			if (min_idx != i) {
				int temp = arr[i];
				arr[i] = arr[min_idx];
				arr[min_idx] = temp;
			}
		}
		System.out.println(Arrays.toString(arr));

	}
}