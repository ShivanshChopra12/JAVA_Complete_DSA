package assignment;

import java.util.*;
public class ReverseNo {

    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        int N= sc.nextInt();
        int rev=0;
        while(N>0){
            int rem=N%10;
            rev=rev*10+rem;
            N=N/10;
        }
        System.out.print(rev);
    }
}
