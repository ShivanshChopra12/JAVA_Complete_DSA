package leetcode;
//977. Squares of a Sorted Array
public class Sq_of_sorted_array {

}

class Solution {
    public int[] sortedSquares(int[] nums) {
        		int left = 0;
		int right = nums.length - 1;
		 int ptr = nums.length-1;
		int ans[] = new int[nums.length];

		while (left <= right) {
			int No1 = nums[left];
			int No2 = nums[right];

			int sq1 = No1 * No1;
			int sq2 = No2 * No2;

			if (sq1 > sq2) {
				ans[ptr--] = sq1;
				left++;
			} else {
				ans[ptr--] = sq2;
				right--;
			}
		}
		return ans;
    }
}
