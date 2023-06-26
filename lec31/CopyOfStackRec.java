package lec31;
import java.util.Stack;
public class CopyOfStackRec {

	public static void main(String[] args) {
	Stack <Integer> MyStack = new Stack<>();
	
	MyStack.push(40);
	MyStack.push(30);
	MyStack.push(20);
	MyStack.push(10);
	
	System.out.println(MyStack);
	Make_copy(MyStack);
	System.out.println(MyStack);
	}
	
	public static void Make_copy(Stack<Integer> S) {
		
		if(S.isEmpty()) {return;}
		
		int ali = S.pop();
		Make_copy(S);
		S.push(ali);
	}

}
