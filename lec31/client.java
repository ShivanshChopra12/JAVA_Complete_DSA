package lec31;

public class client {

	public static void main(String[] args) {
		Stack S = new Stack();
		
		S.add(10);
		S.add(20);
		S.add(30);
		S.add(40);
		S.pop();	
		S.print();
		S.pop();		
		S.pop();		
		S.pop();		
		S.pop();		
		S.print();
	}

}
