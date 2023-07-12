package LambdaExpression;

public class addLmbda {

	@FunctionalInterface
	interface MyLambda {
		int add(int a, int b);
	}

	public static void main(String[] args) {

		MyLambda m = (a,b) -> a+b;

		
		int sum = m.add(20,30);
		System.out.println(sum);
	}

}
