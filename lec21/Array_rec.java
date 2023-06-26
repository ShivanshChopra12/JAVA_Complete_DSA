package lec21;

public class Array_rec {

	public static void main(String[] args) {
		int arr[] = { 10, 20, 30, 40, 50 };
//		Print(0, arr); //10 20 30 40 50
		Print2(1, 3,arr); //20 30 40

	}

	public static void Print(int s, int[] arr) {
		// BP: print(0,arr)
		// SP: print(1,arr)
		if (s == arr.length) {
			return;
		}
		System.out.println(arr[s]);
		Print(s + 1, arr);

	}

	public static void Print2(int s, int e, int[] arr) {
		
		if (s>e) {
			return;
		}
		int mid =(s+e)/2;
		
		Print2(s,mid-1, arr);
		System.out.println(arr[mid]);
		Print2(mid + 1,e, arr);

	}
}
