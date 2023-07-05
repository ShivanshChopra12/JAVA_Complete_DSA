package lec35_Btree;

public class Client {

	public static void main(String[] args) {
		int[] in = { 40, 20, 50, 10, 30, 60 };
		int[] pre = { 10, 20, 40, 50, 30, 60 };

		Btree BT = new Btree(pre, in);
		BT.disp();
		System.out.println("============");
		System.out.println("Size = " + BT.size());
		System.out.println("Height = " + BT.Height());
		
		
	}

}
