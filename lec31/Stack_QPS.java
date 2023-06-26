package lec31;

import java.util.Stack;

public class Stack_QPS {

	public static void main(String[] args) {
		Stack<Integer> S = new Stack<>();

		S.push(10);
		S.push(20);
		S.push(30);
		S.push(40);

		// System.out.println(S);//10 20 30 40
		print(S); // 40 30 20 10
		System.out.println(S); // 10 20 30 40
		print_rec(S); // 10 20 30 40
	}

	public static void print(Stack<Integer> S) {
		Stack<Integer> Ex = new Stack<>();
		while (!S.isEmpty()) {
			int ali = S.pop();
			System.out.print(ali + " ");
			Ex.push(ali);
		}
		System.out.println();
		while (!Ex.isEmpty()) {
			int ali = Ex.pop();
			S.push(ali);

		}
	}

	public static void print_rec(Stack<Integer> S) {
		if(S.isEmpty()) {
			return;
		}
		
		int ali = S.pop();
		print_rec(S);
		System.out.print(ali+" ");
		S.push(ali);
	}

}
