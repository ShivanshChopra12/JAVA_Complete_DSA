package lec22;

public class Factorial {

	public static void main(String[] args) {
//	System.out.println(Facto(5));
	
//	System.out.println(Pow(2,3));
	
System.out.println(Fibo(3));
	}

	public static int Facto(int n) {
		if(n==0) {
			return 1;
		}
		//	BP:Facto(n)
		//  SP:Facto(n-1)
		int sp=Facto(n-1);
		return n*sp ;
	}
	
	public static int Pow(int a, int b) {
//		BP:Pow(a,b)
//		SP:Pow(a,b-1)
		if(b==0) {
			return 1;
		}
		
		int sp= Pow(a,b-1);
		return a*sp;
	}
	
	public static int Fibo(int n) {
		if(n==0) {
			return 0;
		}
		if(n==1) {
			return 1;
		}
		
		int sp1=Fibo(n-1);
		int sp2=Fibo(n-2);
		return sp1+sp2;
	}
}
