package LambdaExpression;

//ek function h is interface me toh ise functionl interface khte h
//a functional interface has exactly one abstract method.

//bydefault interccae ke method public and abstract hote hai

@FunctionalInterface
interface MyLambda {
	 void Display();
}


public class LambdaDemo {

	public static void main(String[] args) {

		//anonymous class
		//without making any class, 
		
		//one way is this
/*		MyLambda m = new MyLambda() {
			public void Display() {
				System.out.println("Hello world");
			}
		};
		m.Display();
*/
		//USING LAMBDA EXPRESSION
		//anonymous method
		//this only accepts an interface which has one fucntion(functional interface)
		MyLambda m = ()->
		{
			System.out.println("hello lambda");
		};
		
		m.Display();
		
		
	}

}
