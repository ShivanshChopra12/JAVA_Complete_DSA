package Lec_PQ;

import java.util.PriorityQueue;

public class PQ_QPS {

	public static void main(String args[]) {
		int arr[] = { 20, 30, 60, 50, 16, 55, 57, 40 };
		topK(arr, 3);

		int[][] brr = { { 10, 20, 30 }, { 15, 35 }, { 5, 7, 12, 25 }, { 17, 22, 40 } };
		mergeKSorted(brr);
	}

	public static void topK(int arr[], int k) {
		PriorityQueue<Integer> PQ = new PriorityQueue<>();

		for (int ali : arr) {
			PQ.add(ali); // logk

			if (PQ.size() > k) {
				PQ.poll(); // logk
			}
		}
		System.out.println(PQ);
	}

	static class pair implements Comparable<pair> {
		public pair(int i, int r, int j) {
			data = i;
			arr_idx = r;
			ali_idx = j;
		}

		int data;
		int ali_idx;
		int arr_idx;

		@Override
		public int compareTo(pair o) {

//			this.compareTo(o);
			return this.data - o.data;
		}
	}

	public static void mergeKSorted(int[][] arr) {
		PriorityQueue<pair> PQ = new PriorityQueue<>();
		for (int r = 0; r < arr.length; r++) {
			PQ.add(new pair(arr[r][0], r, 0));
		}
		while (!PQ.isEmpty()) {
			pair curr = PQ.poll();
			System.out.println(curr.data);
			curr.ali_idx++;
			if (curr.ali_idx < arr[curr.arr_idx].length) {
				curr.data = arr[curr.arr_idx][curr.ali_idx];
				PQ.add(curr);
			}

		}
	}
	
	
}
