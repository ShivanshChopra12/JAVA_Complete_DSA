package LambdaExpression;

public class demo2 {
	@FunctionalInterface
	interface MyLambda {
		 void Display(String str);
	}
	public static void main(String[] args) {

		MyLambda m = (str)->
		{
			System.out.println(str);
		};
		
		m.Display("hiiiiiiiii");
	}

}
