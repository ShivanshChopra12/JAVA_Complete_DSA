package lec29;

public class Client2 {

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.name = "pappu";
		s1.age = 10;

		Student s2 = s1; //s2 me s1 ka address pass hogya hai
		s2.name = "chomu";

		System.out.println(s1.name + " : " + s2.age);
	}

}
