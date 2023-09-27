package AccessModifiers;

public class Private1 {
private int No1 = 20000;
	public static void main(String[] args) {
		Private1 P1 = new Private1();
System.out.println(P1.No1);
P1.Test1();
P1.Test2();
	}
private void Test1() {
	System.out.println("private method :P1"); 
	
}
private void Test2() {
	System.out.println("private method :P2");
}
}
