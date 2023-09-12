package assignment;

import java.util.*;

public class TwoSum {
	// using two pointers

	class Pair {
		int idx, val;

		public Pair(int idx, int val) {		
			this.idx = idx;
			this.val = val;
		}
	}

	class SortByVal implements Comparator<Pair> {

		public int compare(Pair a, Pair b) {
			return a.val - b.val;
		}
	}

	public int[] twoSum(int[] nums, int target) {

		int n = nums.length;
		Pair[] pairs = new Pair[n];

		for (int i = 0; i < nums.length; i++) {
			pairs[i] = new Pair(i, nums[i]);
		}

		Arrays.sort(pairs, new SortByVal());

		int l = 0, r = n - 1;
		while (l < r) {
			int sum = pairs[l].val + pairs[r].val;
			if (sum == target) {
				return new int[] { pairs[l].idx, pairs[r].idx };
			} else if (sum < target)
				l++;
			else
				r--;
		}
		return new int[] {};

	}
}
