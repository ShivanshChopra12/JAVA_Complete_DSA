package lec32;

public class Client {
	public static void main(String Args[]) {
		Min_stack S = new Min_stack();
		S.add(50);
		S.add(100);
		S.add(20);
		S.add(10);
		S.add(15);
		S.add(6);
		
		S.print();

		System.out.println(S.getMin());
		
		S.pop();
		System.out.println(S.getMin());
		
//		System.out.println(S.peek());

	}
}
