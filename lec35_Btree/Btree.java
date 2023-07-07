package lec35_Btree;

import java.util.LinkedList;
import java.util.Queue;

import lec35_Btree.Btree.Node;

public class Btree {

	class Node {
		int data;
		Node left;
		Node right;

		public Node(int i) {
			data = i;
		}
	}

	Node root;

//	creating tree
	public Btree(int[] pre, int[] in) {
		root = createTree(pre, 0, pre.length - 1, in, 0, in.length - 1);
	}

	private Node createTree(int[] pre, int pre_s, int pre_e, int[] in, int in_s, int in_e) {

		if (pre_s > pre_e || in_s > in_e) {
			return null;
		}
		Node nn = new Node(pre[pre_s]);
		int l_size = 0;
		int found = -1;
		for (int idx = in_s; idx <= in_e; idx++) {
			if (in[idx] == pre[pre_s]) {
				found = idx;
				break;
			}
			l_size++;
		}

		nn.left = createTree(pre, pre_s + 1, pre_s + l_size, in, in_s, found - 1);
		nn.right = createTree(pre, pre_s + l_size + 1, pre_e, in, found + 1, in_e);
		return nn;
	}

//	printing tree
	public void disp() {
		disp(root);
	}

	private void disp(Node nn) {
		if (nn == null) {
			return;
		}
		// 10k
		System.out.println(nn.data);
		disp(nn.left);
		disp(nn.right);
	}

//	calculating size or say total no. of nodes
	public int size() {
		return size(root);
	}

	private int size(Node nn) {
		if (nn == null) {
			return 0;
		}

		int L = size(nn.left);
		int R = size(nn.right);
		return L + R + 1;
	}

//	calculating Height
	public int Height() {
		return Height(root);
	}

	int max_Dia = 0;

	private int Height(Node nn) {
		if (nn == null) {
			return -1;
		}
		int L = Height(nn.left);
		int R = Height(nn.right);

//		 this is to calc diameter in O(n)
		int S = 2 + L + R; // calc. max distace btwn any two leaf nodes
		max_Dia = Math.max(max_Dia, S);

		return Math.max(L, R) + 1;
	}

//	calculating diameter with 3 approaches
	public int FDia() { // O(n)
		Height(root);
		return max_Dia;
	}

	public int Dia() { // O(n^2)
		return Dia(root);
	}

	private int Dia(Node nn) {
		if (nn == null) {
			return 0;
		}
		int L = Dia(nn.left);
		int R = Dia(nn.right);
		int S = 2 + Height(nn.left) + Height(nn.right); // +2 root node ke liye
		return Math.max(Math.max(L, R), S);
	}

	public int Dia2() { // O(n^2)
		return Dia2(root).Dia;
	}

	class diaPair {
		int Height = -1;
		int Dia = 0;
	}

	private diaPair Dia2(Node nn) {

		if (nn == null) {
			return new diaPair();
		}

		diaPair L = Dia2(nn.left);
		diaPair R = Dia2(nn.right);

		diaPair ans = new diaPair();

//		 height
		ans.Height = Math.max(L.Height, R.Height) + 1;

//		Dia!!
		int S = L.Height + R.Height + 2;
		ans.Dia = Math.max(S, Math.max(L.Dia, R.Dia));

		return ans;
	}

//	calculating is a tree is balanced or not
	public boolean isBal() {
		return isBal(root);
	}

	private boolean isBal(Node nn) {
		if (nn == null) {
			return true;
		}

		boolean L = isBal(nn.left);
		boolean R = isBal(nn.right);

		boolean self = Math.abs(Height(nn.left) - Height(nn.right)) <= 1;

		return self && L && R;
	}

	public Btree(int[] pre) { // evei bnadia
	}

//		creating tree from level order traversal 
//		array i.e lvl ={ 10,20,30,40,50,-1,60,-1,-1,70,-1,-1,-1,-1,90}
//		make a tree from this array (binary tree)

	public Btree(int[] lvl, int lll) {
		root = new Node(lvl[0]);

		Queue<Node> Q = new LinkedList<>();
		Q.add(root);
		int idx = 1;

		while (!Q.isEmpty() && idx < lvl.length) {
			Node nn = Q.poll();
			if (idx < lvl.length && lvl[idx] != -1) {
				nn.left = new Node(lvl[idx]);
				Q.add(nn.left);
			}
			idx++;

			if (idx < lvl.length && lvl[idx] != -1) {
				nn.right = new Node(lvl[idx]);
				Q.add(nn.right);
			}
			idx++;
		}
	}
}
