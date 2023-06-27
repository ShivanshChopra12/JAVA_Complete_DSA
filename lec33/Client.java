package lec33;

public class Client {

	public static void main(String[] args) {
	//case 1
		C obj1 = new C();
		System.out.println(obj1.data); // ye data C class ka print krega P ka nahi
		System.out.println(obj1.dataC);
		System.out.println(obj1.dataP);

		////////////////////////////////////////////
		System.out.println("=============");
		obj1.funC(); 
		obj1.funP();
		
		obj1.fun();
		((P)obj1).fun();

		
		System.out.println("=============");
		
		////////////////////////////////////////////
//		case 2
		System.out.println(obj1.data); // variable ka collision is resolved by LHS
		System.out.println(((P) obj1).data);

		System.out.println("=====================");

		P obj2 = new C(); // ye sab P ka print krega bcz
		
	//**************************Compiler assumes P; to access C functions typecast to C

		// compiler only looks at LHS
		// JVM dekhta h RHS (Runtime pe)
		
		System.out.println(obj2.data); //P ka print
		System.out.println(obj2.dataP); //P ka print
 		System.out.println(((C) obj2).data); //C ka print
		System.out.println(((C) obj2).dataC); //C ka print
		
		obj2.fun(); //C ka print
		obj2.funP(); //P ka print
		((C)obj2).fun(); //C ka print
		((C)obj2).funC(); //c ka print 
	
		
		

	}

}
