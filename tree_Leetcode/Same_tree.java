//package tree_Leetcode;
// Q100
//public class Same_tree {
//	    public boolean isSameTree(TreeNode p, TreeNode q) {
//	        if(p==null && q==null){return true;}
//	         if(p==null || q==null || p.val!=q.val){return false;}
//	        
//	        boolean left = isSameTree(p.left, q.left);
//	        boolean right = isSameTree(p.right, q.right);
//	        
//	        return left && right;
//	    }
//	
//}
