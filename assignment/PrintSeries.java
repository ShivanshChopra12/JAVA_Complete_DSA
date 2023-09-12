package assignment;

import java.util.Scanner;

public class PrintSeries {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int N1= sc.nextInt();
		int N2= sc.nextInt();
		
		if(N1 < 0 || N1 >= 100 || N2 < 0 || N2 >= 100)
		{
			System.out.println("Invalid input.");
			return;
		}
		
		for(int n=1;N1>0;n++) {
			int val = 3*n+2;
			if(val%N2 != 0) {
				System.out.println(val);
				N1--;
			}
			
		}

	}

}
