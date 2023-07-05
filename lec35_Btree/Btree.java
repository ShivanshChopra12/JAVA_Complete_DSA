package lec35_Btree;

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

	public int Height() {
		return Height(root);
	}

	private int Height(Node nn) {
		if (nn == null) {
			return -1;
		}
		int L = Height(nn.left);
		int R = Height(nn.right);

		return Math.max(L, R) + 1;
	}

}
