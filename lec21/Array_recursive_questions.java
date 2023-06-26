package lec21;

public class Array_recursive_questions {

	public static void main(String[] args) {
		int arr[] = { 10, 20, 30, 40, 50 };
	//	PrintRev(2, arr);
		int ans=Max(1,arr);
	System.out.println(ans);
	}

	public static void PrintRev(int s, int[] arr) {

//	BP:printRev(s,arr)
//	SP:printRev(s+1,arr)

		if (s == arr.length) {
			return;
		}

		PrintRev(s + 1, arr);
		System.out.println(arr[s]);

	}
	
	public static int Max(int s,int[] arr) {
		
//		BP:MAX(s,arr)
//		SP:max(s+1,arr)
		
//		if(s == arr.length-1) {
//			return arr[s];
//		}
		
		if(s==arr.length) {
			return Integer.MIN_VALUE;
		}
		
	 int sp= Max(s+1, arr);
	 return Math.max(arr[s], sp);
		
	}
}
