package lec29;

public class Student {
	// data members
	String name;
	int age;

	public void Intro() {
		System.out.println(name + "-" + age);
		System.out.println(this);
		
		
	}
	//s1.partyWith(s2.name)
	public void partyWith(String Name) {
		System.out.println(this.name + " party with " + Name);
	}
	
	public Student() {
		this("9");
	}
	
	public Student(int lai) {
		name = "jaaduuu";
		age = lai;
	}
	
	public Student(String str) {
		name = str;
		age = 0;
	}
}
