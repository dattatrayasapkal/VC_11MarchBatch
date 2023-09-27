package Methods;													
public class Method1 { // class Body
	// Static regular method calling from same class
	public static void main(String[] args) { //Main method body
//		// starting point the program
		System.out.println("Main Method Started");
		// 1.Direct Calling 
	//Syntax ---> Methodname();
	Demo1();
	Demo2();
//		//2.calling by class name
//		//Syntax -->classname.methodname();
	System.out.println();
	System.out.println("*****************************************");
	Method1.Demo1();
	Method1.Demo2();
	System.out.println("Main Method Ended/Complted");
	}
 public static void Demo1() {
	System.out.println("static regular method calling from same class -->Demo1");

}
public static void Demo2() {
	System.out.println("static regular method calling from same class -->Demo2");
}
}

