package LambdaExpression;

interface AmLambda {
	public int display(String str1, String str2);
}

public class MethodReferencing {

	public MethodReferencing(String S) {
		System.out.println(S.toUpperCase());
	}

	public static void main(String[] args) {

		AmLambda ml = String::compareTo; // A.compareTo(B) =A-B

		System.out.println(ml.display("hello", "hello"));
	}

}
