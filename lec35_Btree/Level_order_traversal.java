package lec35_Btree;

import java.util.LinkedList;
import java.util.Queue;

public class Level_order_traversal extends Balanced_Tree {

	int pre_idx = 0;

	public Level_order_traversal(int[] pre) {
		super(pre);
		pre_idx = 0;
		root = createPre(pre);
	}

	private Node createPre(int[] pre) {
		if (pre[pre_idx] == -1) {
			pre_idx++;
			return null;
		}
		Node nn = new Node(pre[pre_idx]);
		pre_idx++;
		nn.left = createPre(pre);
		nn.right = createPre(pre);
		return nn;
	}

	public void lvlPrint() {
		// print => 10 20 30 40 50 60
		Queue<Node> Q = new LinkedList<>();
		Q.add(root);
		while (!Q.isEmpty()) {
			Node nn = Q.poll();
			System.out.println(nn.data);
			if (nn.left != null) {
				Q.add(nn.left);
			}
			if (nn.right != null) {
				Q.add(nn.right);
			}
		}
	}

	
	public void lvlPrint2() {
//		print in this way : 
//		10
//		20 30
//		40 50 60

		Queue<Node> Q = new LinkedList<>();
		Q.add(root);
		int curr_level_size = 1;
		while (!Q.isEmpty()) {
			
			for (int count = 1; count <= curr_level_size; count++) {
				Node nn = Q.poll();
				System.out.print(nn.data+" ");
				if (nn.left != null) {
					Q.add(nn.left);
				}
				if (nn.right != null) {
					Q.add(nn.right);
				}
			}
			System.out.println();
			curr_level_size = Q.size();
		}
	}
//	creating tree from level order traversal 
//	array i.e lvl ={ 10,20,30,40,50,-1,60,-1,-1,70,-1,-1,-1,-1,90}
//	make a tree from this array (binary tree)
		
	public Level_order_traversal(int []lvl,int lll){
		super(lvl,lll);
	}

}

