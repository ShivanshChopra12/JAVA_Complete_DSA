package lec10;

public class SubArray {

	public static void main(String[] args) {

		int arr[] = { 10, 20, 30, 40 };
		for (int start = 0; start < arr.length; start++) {
			for (int end = start; end < arr.length; end++) {
				int sum = 0;
				for (int k = start; k <= end; k++) {
					sum = sum + arr[k];
					System.out.print(arr[k] + " ");
				}
				System.out.println("=>"+sum);
			}
		}
	}

}
