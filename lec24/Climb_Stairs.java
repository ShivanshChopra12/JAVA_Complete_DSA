package lec24;

public class Climb_Stairs {

	public static void main(String[] args) {
		kuud(0,"",4);
	}

	public static void kuud(int curr, String path, int destination) {
		if(curr==destination) {
			System.out.println(path);
			return;
		}
		if(curr>destination) {
			return;
		}
		kuud(curr+1,path+1,destination);
		kuud(curr+2,path+2,destination);
	}
}
