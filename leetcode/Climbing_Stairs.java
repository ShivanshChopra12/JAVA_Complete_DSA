package leetcode;

public class Climbing_Stairs {

	public static void main(String[] args) {
		System.out.println(Climb(5));
	}
 
	public static int Climb(int stairs) {
		if(stairs<=1) {
			return 1;
		}
		
//		F(4)=F(3)+F(2)
		int sp1=Climb(stairs-1);
		int sp2=Climb(stairs-2);
		return sp1+sp2;
	}
}
