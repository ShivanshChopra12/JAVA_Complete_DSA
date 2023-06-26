package leetcode;
//287. Find the Duplicate Number
public class FindDuplicate {
	public int findDuplicate(int[] nums) {
		int count[] = new int[nums.length];
		int idx;
		for (idx = 0; idx < nums.length; idx++) {
			count[nums[idx]]++;
		}

		for (idx = 0; idx < nums.length; idx++) {
			if (count[idx] > 1) {
				System.out.println(idx);
				return idx;
			}
		}
		return -1;
	}
}
