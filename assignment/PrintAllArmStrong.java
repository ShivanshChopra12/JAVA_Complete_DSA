package assignment;

public class PrintAllArmStrong {

	public static void main(String[] args) {
		printAllArm(2000);

	}

	public static void printAllArm(int n) {

		for (int num = 1; num <= n; num++) {
			if (isArm(num)) {
				System.out.println(num);
			}
		}
	}

	public static boolean isArm(int num) {
		int a = num;
		int sum = 0;
		while (num > 0) {
			int rem = num % 10;
			sum = (int) (sum + Math.pow(rem, numOfDigit(a)));
			num = num / 10;
		}
		return (sum == a);
	}

	public static int numOfDigit(int num) {
		int count = 0;
		while (num != 0) {
			num = num / 10;
			count = count + 1;
		}
		return count;
	}

}
