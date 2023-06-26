package lec6;

public class Rotate {

	public static void main(String[] args) {
		int num =12345;
		
		//counting no of digits
		int backup=num;
		int nod=0;
		while(num>0) {
			num=num/10;
			nod++;
		}
		num=backup;
		
		System.out.println(nod);

		//rotating no. of digits
		int digit=num%10;
		int rem= num/10;
		num = (int) (digit * Math.pow(10, nod-1)+ rem);
		System.out.println(num);
	}

}
