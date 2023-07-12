package lec35_Btree;

public class Client {

	public static void main(String[] args) {
		int[] in = { 40, 20, 50, 10, 30, 60 };
		int[] pre = { 10, 20, 40, 50, 30, 60 };
		int[] pre1 = { 10, 20, 40, -1, -1, 50, -1, -1, 30, -1, 60, -1, -1 };

		int lvl[] = { 10, 20, 30, 40, 50, -1, 60, -1, -1, 70, -1, -1, -1, -1, 90 };
		
		
		Btree BT = new Btree(pre, in);
		System.out.println("======tree from pre and in======");
		BT.disp();

		System.out.println("============");

		System.out.println("Size = " + BT.size());
		System.out.println("Height = " + BT.Height());

		System.out.println("Diameter m1 = " + BT.Dia()); // n^2
		System.out.println("Diameter m2= " + BT.FDia()); // n
		System.out.println("Diameter m3= " + BT.Dia2()); // n

		System.out.println("balanced m1= " + BT.isBal());

		Balanced_Tree T = new Balanced_Tree(pre, in);
		System.out.println("balanced m2 = " + T.isBal2());

		// tre from preorder
		System.out.println("=========treee from pre=========");
		Level_order_traversal LT = new Level_order_traversal(pre1);
		LT.disp();
		System.out.println("======Level Printing======");
		LT.lvlPrint();

		System.out.println("======Level Detecting======");
		LT.lvlPrint2();

		System.out.println("======================");
		// creating tree from 10,20,30,40,50,-1,60,-1,-1,70,-1,-1,-1,-1,90}
		Level_order_traversal LLT = new Level_order_traversal(lvl, 1);
		LLT.lvlPrint2();

		Binary_Search_tree BSTT = new Binary_Search_tree(pre1);
		System.out.println(BSTT.isBST());
	}
}
