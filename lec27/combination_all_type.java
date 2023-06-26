package lec27;

public class combination_all_type {

	public static void main(String[] args) {
		int r=2;
		int n=4;
		PTeacher(r,-1,"",n);
		System.out.println("=========");
		seat(0,r,"",n);
	}

	public static void PTeacher(int r, int prev, String path, int n) {
		if (r == 0) {
			System.out.println(path);
			return;
		}
		for (int curr = prev + 1; curr < n; curr++) {
			PTeacher(r - 1, curr, path + "b" + curr, n);
		}
	}

	
	public static void seat (int curr,int toPlace,String path 
			,int total_seats) {
		
		if(toPlace==0) { //+ve BC
			System.out.println(path);
			return;
		}
		
		if(curr==total_seats) { //-ve base case
			return;
		}
		
		seat(curr+1,toPlace-1, path+"q"+curr,total_seats);
		seat(curr+1,toPlace, path,total_seats);
		
	}
}
