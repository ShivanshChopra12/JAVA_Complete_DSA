package lec35_Btree;

public class BST {
	class Node {
		public Node(int i) {
			// TODO Auto-generated constructor stub
			data = i;
		}

		int data;
		Node left;
		Node right;
	}

	Node root;

	public void disp() {
		disp(root);
	}

	private void disp(Node nn) {
		if (nn == null) {
			return;
		}
//			10K 
		System.out.println(nn.data);
		disp(nn.left);
		disp(nn.right);
	}

	public BST(int[] pre, int[] in) {
		root = createTree(pre, 0, pre.length - 1, in, 0, in.length - 1);
	}

	private Node createTree(int[] pre, int pre_s, int pre_e, int[] in, int in_s, int in_e) {
		if (pre_s > pre_e || in_s > in_e) {
			return null;
		}
		Node nn = new Node(pre[pre_s]);

		int f = -1;
		int l_size = 0;
		for (int idx = in_s; idx <= in_e; idx++) {
			if (in[idx] == pre[pre_s]) {
				f = idx;
				break;
			}
			l_size++;
		}
		nn.left = createTree(pre, pre_s + 1, pre_s + l_size, in, in_s, f - 1);
		nn.right = createTree(pre, pre_s + l_size + 1, pre_e, in, f + 1, in_e);

		return nn;
	}

	public boolean find(int ali) {
		return find(root, ali);
	}

	private boolean find(Node nn, int ali) {

		if (nn == null) {
			return false;
		}

		if (nn.data == ali) {
			return true;
		} else if (nn.data > ali) {
			return find(nn.left, ali);
		} else {
			return find(nn.right, ali);
		}
	}

	public void remove(int ali) {
		root = remove(root, ali);
	}

	private Node remove(Node nn, int ali) {
		if (nn == null) {
			return null;
		} else if (nn.data < ali) {
			nn.right = remove(nn.right, ali);
		} else if (nn.data > ali) {
			nn.left = remove(nn.left, ali);
		} else {
//			found ali!!
//			Case1 ali is leaf
			if (nn.left == null && nn.right == null) {
				return null;
			}

//			case2 ali ka ek bcha h
			if (nn.left != null && nn.right == null) {
				return nn.left;
			}
			if (nn.left == null && nn.right != null) {
				return nn.right;
			}

//			case3 , both child present
			nn.data = findMin(nn.right);
//			nn.data ki copy bngyi h  ab usse deete krna h , right me se
			nn.right = remove(nn.right, nn.data);
			
//			or
//			nn.data =findMax(nn.left);
//			nn.left= remove(nn.left, nn.data);
		}
		return nn;
	}

	public int findMin(Node node) {
		if (node == null) {
			return Integer.MAX_VALUE;
		}
		int res = node.data;
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
