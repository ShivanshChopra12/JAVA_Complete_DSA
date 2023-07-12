package lec35_Btree;

public class Binary_Search_tree extends Level_order_traversal {

	public Binary_Search_tree(int[] pre) {
		super(pre);
		// TODO Auto-generated constructor stub
	}

	public boolean isBST() {
		return isBST(root).b;
	}

	class pairBST {
		boolean b = true;
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
	}

	private pairBST isBST(Node nn) {
		if (nn == null) {
			return new pairBST();
		}
		pairBST L = isBST(nn.left);
		pairBST R = isBST(nn.left);

//		complexity On2 chli gyi , so min	 and max hum class bnakr ek hi baari me le lege  
//		boolean self = max(nn.left)<nn.data && nn.data< min(nn.right); 
//		return L && R && self;

		pairBST ans = new pairBST();
//		self
		boolean self = L.max < nn.data && nn.data < R.min;

		ans.b = self && L.b && R.b;

		// min and max //min always lie in left subtree and max in right sub tree
		ans.min = Math.min(nn.data, L.min);
		ans.max = Math.max(nn.data, R.max);

		return ans;
	}
	
	
}

