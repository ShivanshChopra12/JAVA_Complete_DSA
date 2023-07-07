//package tree_Leetcode;
// Q236

//public class Lowest_common_ancestor {
//
//	 public TreeNode lowestCommonAncestor(TreeNode nn, TreeNode p, TreeNode q) {
//	        
//	        if(nn==null||nn==p||nn==q){
//	            return nn;
//	        }
//	        
//	        TreeNode L = lowestCommonAncestor(nn.left,p,q);
//	        TreeNode R =lowestCommonAncestor(nn.right,p,q);
//	        
//	        if(L!=null && R == null){
//	            return L;
//	        }
//	        
//	        if(R!=null && L == null){
//	            return R;
//	        }
//	        
//	        if(L==null && R == null){
//	            return null;
//	        }
//	        return nn;
//	    }
//}
