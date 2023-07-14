package tree_Leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class BottomLeftTreeVal {
	/**
	 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
	 * left; TreeNode right; TreeNode() {} TreeNode(int val) { this.val = val; }
	 * TreeNode(int val, TreeNode left, TreeNode right) { this.val = val; this.left
	 * = left; this.right = right; } }
	 */

	public int findBottomLeftValue(TreeNode root) {
//here we putting data in queue normally by traversing but we are storing result at
//		i = 0 so that we get the left most element
		int result = 0;
		Queue<TreeNode> q = new LinkedList<>();
		q.offer(root); // q.add() both same

		while (!q.isEmpty()) {
			int size = q.size();
			for (int i = 0; i < size; i++) {
				TreeNode nn = q.poll();

				if (i == 0) {
					result = nn.val;
				}
				if (nn.left != null) {
					q.offer(nn.left);
				}
				if (nn.right != null) {
					q.offer(nn.right);
				}
			}
		}
		return result;

//here we are putting data in queue in left to right order 
//	like first left node then right node , to get the left modst node

//			for (int i = 0; i < size; i++) {
//				TreeNode nn = q.poll();
//
//				if (nn.right != null) {
//					q.offer(nn.right);
//				}
//				if (nn.left != null) {
//					q.offer(nn.left);
//				}
//
//				result = nn.val;
//			}

	}
}
