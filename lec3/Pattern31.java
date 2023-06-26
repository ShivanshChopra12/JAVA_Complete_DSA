package lec3;

public class Pattern31 {

	public static void main(String[] args) {
	int row=1;
	int num=5;
	while(row<=5) {
	while(num!=0) {
		if(row==num) {
			System.out.print(" * ");
		}else {
		System.out.print(" " + num +" " );	
		}num--;
	}
	System.out.println();
	num=5;
	row++; 
	}
	}

}
