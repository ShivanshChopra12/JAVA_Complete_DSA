package lec23;
import java.util.ArrayList;

public class LKC {
	public static void main(String[] args) {
		String str = "678";
		ArrayList<String> words = getKPC(str);
		System.out.println(words);
	}

	
	public static ArrayList<String> getKPC(String str) {
		if (str.length()==0) {
			ArrayList<String> bresult= new ArrayList<>();
			return bresult;
		}
		
		//678
		String remain= str.substring(1); //78
		char ch= str.charAt(0); //6
		
		ArrayList<String> HalfResult= getKPC(remain); //6 words of 78
		if(HalfResult.size()==0) {
			HalfResult.add("");
		}
		
		ArrayList<String> TotalResult= new ArrayList<>(); //24 words of 678
		
		String codeforch =codes[ch-'0']; //pqrs
		for(int i=0;i<codeforch.length();i++) {
			char ChCode= codeforch.charAt(i);
			for(String ali : HalfResult) {
				TotalResult.add(ChCode + ali);
			}
		}
		
		return TotalResult;
		
	}

	static String[] codes = { ".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz" };

}

