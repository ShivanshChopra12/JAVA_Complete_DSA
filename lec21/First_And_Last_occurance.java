package lec21;

public class First_And_Last_occurance {

	public static void main(String[] args) {
		int arr[] = { 2, 4, 3, 5, 4, 7, 6, 7, 3, 4, 2, 5, 6 };
		int num = 3;
		int ans = PrintFirst(0, arr, num);
		int ans2 = PrintLast(0, arr, num);
		System.out.println(ans + " " + ans2);
	}

	public static int PrintFirst(int s, int[] arr, int num) {
		if (s == arr.length) {
			return -1;
		}
		
//		BP:(0,arr,3)
//		Sp:(1,arr,3)	

		int sp = PrintFirst(s + 1, arr, num);
		if (arr[s] == num) {
			return s;
		} 
			return sp;
	}

	public static int PrintLast(int s, int[] arr, int num) {
		if (s == arr.length) {
			return -1;
		}
//		BP:(0,arr,3)
//		Sp:(1,arr,3)
		
		int sp = PrintLast(s + 1, arr, num);
		if (sp == -1 && arr[s] == num) {
			return s;
		}
		return sp;
	}

}
