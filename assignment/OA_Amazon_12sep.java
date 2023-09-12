package assignment;
//ques link :
//https://imgbb.com/myHm4SY
public class OA_Amazon_12sep {

	public static void main(String[] args) {
		Solution solution = new Solution();
		int[] nums = { 2, 3, -2, 4 }; // You can change the input array as needed

		int result = solution.findMaxProduct(nums);
		System.out.println("Max Product: " + result);
	}
}

class Solution {
	public int findMaxProduct(int[] nums) {
		int prefix = 1;
		int suffix = 1;
		int n = nums.length;
		int maxProduct = Integer.MIN_VALUE;

		for (int i = 0; i < n; i++) {
			if (prefix == 0) {
				prefix = 1;
			}

			if (suffix == 0) {
				suffix = 1;
			}

			prefix = prefix * nums[i];
			suffix = suffix * nums[n - 1 - i];

			maxProduct = Math.max(maxProduct, Math.max(prefix, suffix));
		}

		return maxProduct;
	}
}
