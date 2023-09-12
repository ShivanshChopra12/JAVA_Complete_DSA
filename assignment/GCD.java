package assignment;

import java.util.*;
public class GCD {

	    public static void main(String args[]) {
	   Scanner sc = new Scanner(System.in);
	   int N1= sc.nextInt();
	   int N2= sc.nextInt();

	 //  int divisor =N1;
	  // int dividend=N2;
	   
	   while(N1%N2!=0){
	       int rem= N1%N2;
	       N1=N2;
	       N2=rem;
	   }
	   System.out.print(N2);
	    }
	}

