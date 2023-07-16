package Lec_PQ;

import java.util.Collections;
import java.util.PriorityQueue;

public class MediaOfARunningStream {

	public static void main(String[] args) {
		int[] arr = { 1, 0, 1, 3, 2, 4, 2 };
		MedianOfARuningStream(arr);
	}

	public static void MedianOfARuningStream(int[] arr) {
		PriorityQueue<Integer> Left = new PriorityQueue<>(Collections.reverseOrder());
		PriorityQueue<Integer> Right = new PriorityQueue<>();

		for (int ali : arr) {
			if (Left.isEmpty() || Left.peek() >= ali) {
				Left.add(ali);
			} else {
				Right.add(ali);
			}
			if (Left.size() - Right.size() > 1) {
				Right.add(Left.poll());

			} else if (Right.size() - Left.size() > 1) {
				Left.add(Right.poll());
			}
			System.out.println(Left + " - " + Right);

			if (Left.size() == Right.size()) {
				System.out.println((Left.peek() + Right.peek() + 0.0) / 2);
			} else if (Left.size() - Right.size() == 1) {
				System.out.println(Left.peek());
			} else if (Left.size() - Right.size() == -1) {
				System.out.println(Right.peek());
			}

			System.out.println("==============");
		}
	}
}
