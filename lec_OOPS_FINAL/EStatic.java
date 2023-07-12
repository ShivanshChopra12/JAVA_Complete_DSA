package lec_OOPS_FINAL;

public class EStatic {
	 static int count=0;

	 EStatic(){
		 count ++;
		 System.out.println(count);
	 }
	 
		EStatic(int a) {
			System.out.println("haha");
		}

		 public static void main(String args[]) {
		 
		 EStatic c1 =new EStatic();
		 EStatic c2 =new EStatic();
		 EStatic c3 =new EStatic();
		 
	 }
	 
}
	
