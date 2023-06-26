package lec29;

public class Client_3 {

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.name = "A";
		s1.age = 10;
		s1.Intro();
		System.out.println(s1);
		System.out.println("----------------");

		Student s2 = new Student();
		s2.name = "B";
		s2.age = 20;
		s2.Intro();
		System.out.println(s2);
		System.out.println("---------------");

		s1.partyWith(s2.name);
	}

}
