package lec29;

public class Oops_Swap {

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.name = "A";
		s1.age = 10;

		Student s2 = new Student();
		s2.name = "B";
		s2.age = 20;

		System.out.println(s1.name + s1.age);
		System.out.println(s2.name + s2.age);

//		Test1(s1,s2);
//		Test2(s1,s2);
		int myAge=100;
		String myName="lal badshaah don";
		Test3(s1,s1.name,s1.age,myName,myAge);
		System.out.println(s1.name + s1.age);
		System.out.println(s2.name + s2.age);

	}

	public static void Test1(Student s1, Student s2) {
		Student temp = s1;
		s1 = s2;
		s2 = temp;
	}
	
	public static void Test2(Student s1, Student s2) {
		String temp_s = s1.name;
		s1.name = s2.name;
		s2.name = temp_s;

		int temp_i = s1.age;
		s1.age = s2.age;
		s2.age = temp_i;
	} 
	
	public static void Test3(Student s1, String Name,
			int Age,String myName,int myAge) {
		s1.name = "";
		s1.age = 0;

		Name = "";
		Age = 0;

		myName = "";
		myAge = 0;
	}
}
