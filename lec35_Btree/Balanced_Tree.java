package lec35_Btree;

public class Balanced_Tree extends Btree {
	
	public Balanced_Tree(int[] pre, int lll) {
		super(pre, lll);
	}

	public Balanced_Tree(int[] pre) {
		super(pre);
		// TODO Auto-generated constructor stub
	}

	public Balanced_Tree(int[] pre, int[] in) {
		super(pre , in);
	}

	public boolean isBal2() {
		return isBal2(root).b;
	}
	
	class pairBal {
		int Height = -1;
		boolean b = true;
	}

	private pairBal isBal2(Node nn) {
		if (nn == null) {
			return new pairBal();
		}

		pairBal L = isBal2(nn.left); // left tree balanced h ya nahi
		pairBal R = isBal2(nn.right); // right tree balanced h ya nahi

		boolean self = Math.abs(L.Height - R.Height) <= 1; // self(root) balanced h ya nahi

		// new pair
//		BP:10 logo ko khana khilana h 
//		SP:9 logo ko khana khilana h (1 Ka bnaduga , use kruga)
		pairBal ans = new pairBal();

		ans.b = self && L.b && R.b;
		ans.Height = Math.max(L.Height, R.Height) + 1; // ye root se poori height ajegi , sidha values use ki h
		
		return ans;
	}
}
