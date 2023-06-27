package lec33;

public class Client_Q {

	public static void main(String[] args) {
		Queue Q = new Dynamic_Q();

		Q.add(10);
		Q.add(20);
		Q.add(30);
		Q.add(40);
		Q.add(50);
		Q.print();

		System.out.println(Q.poll());
		System.out.println(Q.poll());
		System.out.println(Q.poll());
		System.out.println(Q.poll());
		System.out.println(Q.poll());

		Q.add(70);
		Q.add(80);
		Q.add(90);
		Q.add(100);
		Q.add(110);
//		System.out.println(Q.poll());
		Q.print();

		System.out.println("=================");
		for (int i = 1; i <= 10; i++) {
			Q.add(i * 1000);
		}

		Q.print();

		System.out.println("=================");
		while (!Q.isEmpty()) {
			System.out.print(" -" + Q.poll());
		}
	}
}
