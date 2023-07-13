package tree_Leetcode;

//1373. Maximum Sum BST in Binary Tree

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode() {
	}

	TreeNode(int val) {
		this.val = val;
	}

	TreeNode(int val, TreeNode left, TreeNode right) {
		this.val = val;
		this.left = left;
		this.right = right;
	}
}

public class MAXBST {
	int max_sum = 0;

	public int maxSumBST(TreeNode root) {
		max_sum = 0;
		maxBST(root);

		return max_sum;
	}

	class pair {
		boolean isBST = true; // BST h ya nahi
		int sum = 0; // sum on a given node
		
		//yaha se Rmax and Lmin nikalege
		int max = Integer.MIN_VALUE; // max at a given node
//		(binary tree ka max store krwaege isme and 
//		max right subtree me hoga )
		int min = Integer.MAX_VALUE; // min at a given node
	}

	public pair maxBST(TreeNode nn) {
		if (nn == null) {
			return new pair();
		}

		pair L = maxBST(nn.left);
		pair R = maxBST(nn.right);

		pair self = new pair();

		if (L.isBST && R.isBST && nn.val > L.max && nn.val < R.min) {

			self.sum = L.sum + R.sum + nn.val;

			max_sum = Math.max(max_sum, self.sum);

			self.isBST = true;
		}

		else {
			self.isBST = false;
			self.sum = Math.max(L.sum, R.sum);
		}

		self.max = Math.max(nn.val, R.max);
		self.min = Math.max(nn.val, L.min);

		return self;
	}
}
