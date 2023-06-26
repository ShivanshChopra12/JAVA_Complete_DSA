package lec25;
import java.util.*;

public class partioning {

	public static void main(String[] args) {
		List<String> AL_bag=new ArrayList<>();
		kaat("abc", "",AL_bag);
		
	}

	public static void kaat(String table, String bag,List<String> AL_bag) {
		// table=abc
		
		if(table.isEmpty()) {
			System.out.println(bag);
			System.out.println(AL_bag);
			System.out.println("==========================");
		}
		
		for (int chakku = 1; chakku <= table.length(); chakku++) {
			String piece = table.substring(0, chakku);// a
			String remain = table.substring(chakku);// bc
//			System.out.println(chakku+" "+piece + "--" + remain);
			List<String> nbag =new ArrayList<>(AL_bag);
			nbag.add(piece);
			kaat(remain,bag+piece+"-",nbag);
		}
	}

}

//ArrayList<String> AL_bag = new ArrayList<>();
//AL_bag.add("Apple");
//AL_bag.add("Banana");
//
//List<String> nbag = new ArrayList<>(AL_bag);
//nbag.add("Orange");
//
//System.out.println(AL_bag);  // Output: [Apple, Banana]
//System.out.println(nbag);    // Output: [Apple, Banana, Orange]
