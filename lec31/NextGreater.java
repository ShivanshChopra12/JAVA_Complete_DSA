package lec31;

import java.util.Arrays;
import java.util.Stack;

public class NextGreater {

	public static void main(String[] args) {
		int arr[] = { 50, 30, 20, 40, 10, 45, 5, 60, 15, 8 };
		nxtGr8er(arr);
		nxtGr8er2(arr);
	}

	public static void nxtGr8er(int[] arr) {
		Stack<Integer> S = new Stack<>();
		// A->B Nahhhh..
		// B->A

		for (int B : arr) {
			while (!S.isEmpty() && B > S.peek()) {
				int A = S.pop();
				System.out.println(A + "=>" + B);
			}
			S.push(B);
		}
		while (!S.isEmpty()) {
			int A = S.pop();
			System.out.println(A + "=>" + -1);
		}
	}

	public static void nxtGr8er2(int arr[]) {
		Stack<Integer> S = new Stack<>();
		int ans[] = new int[arr.length];
		for (int idx = 0; idx < arr.length; idx++) {
			int B = arr[idx];
			while (!S.isEmpty() && B > arr[S.peek()]) {
				int A_idx = S.pop();
				ans[A_idx] = B;
			}
			S.push(idx);
		}
		System.out.println(Arrays.toString(ans));
	}

}
