package lecc20;

public class Recursion_basics {

	public static void main(String[] args) {
		
	//	PI(5); //54321
	//	PD(5); //12345
	//	PD2(1,5); //12345
	//	PDI(5);//5432112345
		
		PID(1,4); //12344321
	}

	public static void PI(int n) {
		if (n == 0) {
			return;
		}
		// BP: PI(n)
		// SP: PI(n-1)
		System.out.println(n);
		PI(n - 1);
	}

	public static void PD(int n) {
		if (n == 0) {
			return;
		}
		// BP: PD(n)
		// SP: PD(n-1)
		PD(n - 1);
		System.out.println(n);
	}
	
	public static void PD2(int s,int e) {
		if (s>e) {
			return;
		}
		// BP: PD2(s,e)
		// SP: PD(s+1,e)
		System.out.println(s);
		PD2(s+1,e);
	}
	
	//important ques
	public static void PDI(int n) {
		if (n == 0) {
			return;
		}
		// BP: PDI(n)
		// SP: PDI(n-1)
		System.out.println(n);
		PDI(n - 1);
		System.out.println(n);
		
	}
	public static void PID(int s,int e) {
		// BP: PID(1,4)
		// SP: PID(2,4)
		if(s>e) {
			return;
		}
		System.out.println(s);
		PID(s+1,e);
		System.out.println(s);
		
	}
	
	
	
	
}
