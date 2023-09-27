package Methods;

public class Method4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Main method started");
//static regular method calling from different class
//1.direct calling method name
//Test1();
//Test2();
// calling by class name
Method3.Test1();
Method3.Test2();
Method4.Demo4();
}
public static void Demo4() {
	System.out.println("Demo4 method");
}
}
