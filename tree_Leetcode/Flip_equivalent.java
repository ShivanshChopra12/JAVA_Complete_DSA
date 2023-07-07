//package tree_Leetcode;
//
//public class Flip_equivalent {
//
//	public boolean flipEquiv(TreeNode root1, TreeNode root2) {
//
//		if (root1 == null && root2 == null) {
//			return true;
//		}
//
//		if (root1 == null || root2 == null || root1.val != root2.val) {
//			return false;
//		}
//
//		Boolean equal = flipEquiv(root1.left, root2.left) && flipEquiv(root1.right, root2.right);
//		Boolean flip = flipEquiv(root1.left, root2.right) && flipEquiv(root1.right, root2.left);
//
//		return equal || flip;
//	}
//
//}
