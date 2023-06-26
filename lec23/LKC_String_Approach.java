package lec23;;

public class LKC_String_Approach {

	public static void main(String[] args) {
		Solve("246","");

	}

	public static void Solve(String buttons, String ans) {
//		BP : buttons :246
//		SP: buttons:46
		
		if(buttons.isEmpty()) {
			System.out.println(ans);
			return;
		}
		
		String remain=buttons.substring(1);//46
		char ch=buttons.charAt(0);//2
		String op=options(ch);//abc
		
		for(int i=0;i<op.length();i++) {
			Solve(remain,ans+op.charAt(i));
		}
	}
	
	public static String options(char ch) {
		String arr[]= {	"abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
		return arr[ch-'2'];
	}
}
