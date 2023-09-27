package Methods;

public class Method5 {
//Nonstatis  regular method calling from same class
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Main Method started");
//1.Direct calling 
//Demo1();
//Demo2();
// 2.calling by clas name
//Method5.Demo1();
//Method5.Demo2();
// Object creation 
// Syntx-- classname ref.variablename = new classname();

Method5 obj = new Method5();
Method5 obj1 = new Method5();
//obj ref,variablename.methodname();
obj.Demo1();
obj.Demo2();
obj1.m1();
System.out.println("Main Method Ended");	

}
	public static void Demo1() {
		System.out.println("Non static regular method calling from same class -->Demo1");
		
	}
	public static void Demo2() {
		System.out.println("Non static regular method calling from same class -->Demo2");
}
	public void m1() {
		System.out.println("Hello");
	}
}
