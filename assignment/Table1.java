package assignment;

import java.util.Scanner;

public class Table1 {

	public static void main(String[] args) {
		Scanner q = new Scanner(System.in);
		int x = q.nextInt();
		int y = q.nextInt();
		int i = 1;
		while (x * i <= y) {
			System.out.println(x*i);
			i++;
		}
	}
}
