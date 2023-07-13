package tree_Leetcode;

import java.util.ArrayList;
import java.util.List;
// 199. Binary Tree Right Side View
public class RightSideView_BTree {

	/**
	 * Definition for a binary tree node.
	 * public class TreeNode {
	 *     int val;
	 *     TreeNode left;
	 *     TreeNode right;
	 *     TreeNode() {}
	 *     TreeNode(int val) { this.val = val; }
	 *     TreeNode(int val, TreeNode left, TreeNode right) {
	 *         this.val = val;
	 *         this.left = left;
	 *         this.right = right;
	 *     }
	 * }
	 */
	
	public List<Integer> rightSideView(TreeNode root) {

		List<Integer> Result = new ArrayList<Integer>();
		rightView(root, Result, 0);
		return Result;
	}

	// Self Right Left traversing
	public void rightView(TreeNode nn, List<Integer> Result, int curLevel) {
		if (nn == null) {
			return;
		}

		if (Result.size() == curLevel) {
			Result.add(nn.val);
		}

		rightView(nn.right, Result, curLevel + 1);
		rightView(nn.left, Result, curLevel + 1);
	}

}
