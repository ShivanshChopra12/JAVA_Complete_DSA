package lec6;

import java.util.Scanner;

public class Char_input {

	public static void main(String[] args) {
		Scanner scn= new Scanner(System.in);
		char ch= scn.next().charAt(0);
		System.out.println((int)ch);

		System.out.println(20+10+"Hello"+ (10+20));
		System.out.println(20+10+"Hello"+20);
	}

}
