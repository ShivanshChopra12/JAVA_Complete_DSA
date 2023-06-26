package leetcode;

// Leet code 1480
public class Running_sum {

	public int[] runningSum(int[] nums) {
		int idx = 1;
		while (idx < nums.length) {
			nums[idx] = nums[idx] + nums[idx - 1];
			idx++;
		}
		return nums;
	}
}
