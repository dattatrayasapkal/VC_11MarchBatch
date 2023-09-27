package Methods;

public class Method6 {
// Non static Method calling in same class
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Mian Method Started");
		//
		Method6 sc = new Method6();
		sc.m1();
		sc.m2();
		sc.m3();
//quesion
// can i access static method by using obj.ref---yes/no
		// ans ---> yes we can access static method but it will throw  warning msg.
		//msg--> The methodm3()from the type metthod should be access in a static way
	}
public void m1() {
	System.out.println("Non Static Regular Method calling in same class---m1");
}
void m2() {
	System.out.println("Non Static Regular Method calling in same class---m2");

}
public static void m3(){
	System.out.println("static Method");
}}

