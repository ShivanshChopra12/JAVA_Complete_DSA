package lec23;

public class SubSequence {

	public static void main(String[] args) {
		SS("abc","");
	}

	public static void SS(String str, String path) {
		if(str.isEmpty()) {
			System.out.println(path+"]");
			return;
		}
		
		String remain=str.substring(1);
		char ch= str.charAt(0);
		SS(remain, path+ch);
		SS(remain, path);
	}
}
