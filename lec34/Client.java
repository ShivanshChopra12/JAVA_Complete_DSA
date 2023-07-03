package lec34;

public class Client {

	public static void main(String[] args) {
		LinkedList LL = new LinkedList();
		LL.addFirst(10);
		LL.addLast(20);
		LL.addLast(30);
		LL.addLast(40);
		LL.disp();
		System.out.println("=========");
		LL.printRev();
		
		System.out.println("================");
//		LL.Rev();
//		LL.disp();
		
		LL.RevRec();
		LL.disp();
	}

}
