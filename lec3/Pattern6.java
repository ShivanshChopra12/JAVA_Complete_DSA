package lec3;

import java.util.Scanner;

public class Pattern6 {

	public static void main(String[] args) {
		int n = 5;
		int total_star=n;
		int total_space=0;
		int row = 1;

		while (row <= n) {
			
			int count_space=0;
			while (count_space < total_space) {
				System.out.print(" ");
				count_space++;
			}
			
			int count_star = 0;
			while (count_star < total_star) {
				System.out.print("*");
				count_star++;
			}
			System.out.println();
			row++;
			total_space= total_space+2;
			total_star--;
		
		}

	}

}
