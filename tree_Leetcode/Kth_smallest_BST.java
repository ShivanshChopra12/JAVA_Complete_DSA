package tree_Leetcode;

//230. Kth Smallest Element in a BST

public class Kth_smallest_BST {
	/**
	 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
	 * left; TreeNode right; TreeNode() {} TreeNode(int val) { this.val = val; }
	 * TreeNode(int val, TreeNode left, TreeNode right) { this.val = val; this.left
	 * = left; this.right = right; } }
	 */
	int count = 0;
	int out = 0;

	public int kthSmallest(TreeNode root, int k) {
		recursive(root, k);
		return out;
	}

	public void recursive(TreeNode nn, int k) {

		if (nn.left != null) {
			recursive(nn.left, k);
		}
		count++;

		if (count == k) {
			out = nn.val;
		}

		if (nn.right != null) {
			recursive(nn.right, k);
		}
	}
}
