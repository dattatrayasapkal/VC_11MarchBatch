package Methods;

public class Method2 {

	public static void main(String[] args) {
		
		System.out.println("Main Method Started");
//1.direct calling by method name
		staticmethod1();
		staticmethod2();
	System.out.println();
	System.out.println("*************************************");
	//2.calling by classname
	Method2.staticmethod1();
	Method2.staticmethod2();
	}
public static void staticmethod1() {
	int i = 10;
	int j = 20;
	int k = i+j;
	System.out.println("addition of two no.is -->"+k);
}
public static void staticmethod2() {
	System.out.println("static method calling from class");
}
}
