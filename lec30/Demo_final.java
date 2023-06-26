package lec30;

public class Demo_final {
	public static void main(String[] args) {
		System.out.println(ll());
	}

	public static int ll() {
		try {

			return 10;
		} finally {
			return -10;
		}
	}
}
