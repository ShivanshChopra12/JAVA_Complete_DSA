package lec35_Btree;

class BST_yes_or_no{
} 

//submitted on gfg 

//class Solution {
//	// Function to check whether a Binary Tree is BST or not.
//	boolean isBST(Node root) {
//		if (root == null) {
//			return true;
//		}
//		boolean L = isBST(root.left);
//		boolean R = isBST(root.right);
//
//		boolean self = findMax(root.left) < root.data && root.data < findMin(root.right);
//
//		return L && R && self;
//
//	}
//
//	public int findMax(Node node) {
//		if (node == null) {
//			return Integer.MIN_VALUE;
//		}
//
//		int res = node.data;
//		int lres = findMax(node.left);
//		int rres = findMax(node.right);
//
//		if (lres > res) {
//			res = lres;
//		}
//		if (rres > res) {
//			res = rres;
//		}
//		return res;
//	}
//
//	public int findMin(Node node) {
//		if (node == null) {
//			return Integer.MAX_VALUE;
//		}
//
//		int res = node.data;
//		int lres = findMin(node.left);
//		int rres = findMin(node.right);
//
//		if (lres < res) {
//			res = lres;
//		}
//		if (rres < res) {
//			res = rres;
//		}
//		return res;
//	}
//
//}