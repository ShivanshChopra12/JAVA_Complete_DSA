package tree_Leetcode;

//450. Delete Node in a BST

public class DeleteNodeBST {
	/**
	 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
	 * left; TreeNode right; TreeNode() {} TreeNode(int val) { this.val = val; }
	 * TreeNode(int val, TreeNode left, TreeNode right) { this.val = val; this.left
	 * = left; this.right = right; } }
	 */
	public TreeNode deleteNode(TreeNode nn, int ali) {

		if (nn == null) {
			return null;
		} else if (nn.val < ali) {
			nn.right = deleteNode(nn.right, ali);
		} else if (nn.val > ali) {
			nn.left = deleteNode(nn.left, ali);
		} else {
//				found ali!!
//				Case1 ali is leaf
			if (nn.left == null && nn.right == null) {
				return null;
			}

//				case2 ali ka ek bcha h
			if (nn.left != null && nn.right == null) {
				return nn.left;
			}
			if (nn.left == null && nn.right != null) {
				return nn.right;
			}

//				case3 , both child present //left se max nikalo ya right se min
			nn.val = findMin(nn.right);
//				nn.data ki copy bngyi h  ab usse deete krna h , right me se
			nn.right = deleteNode(nn.right, nn.val);

		}
		return nn;
	}

	public int findMin(TreeNode node) {
		if (node == null) {
			return Integer.MAX_VALUE;
		}
		int res = node.val;
		int lres = findMin(node.left);
		int rres = findMin(node.right);

		if (lres < res) {
			res = lres;
		}
		if (rres < res) {
			res = rres;
		}
		return res;
	}

}
