package lec10;

public class Kadance {
	public static void main(String[] args) {
		int arr[] = { 10, 20, 30, 40 };

		System.out.println(M3(arr));
	}

	public static int M3(int[] arr) {
		int ans = arr[0];
		int sum = 0;
		for (int ali : arr) {
			sum = sum + ali;
			if (ans < sum) {
				ans = sum;
			}
			if (sum < 0) {
				sum = 0;
			}
		}
		return ans;
	}
}
