package AccessModifiers;

public class Default1 {
int A = 3477;
	public static void main(String[] args) {
		Default1 d1 = new Default1();
		System.out.println(d1.A);

		d1.M1();
		d1.M2();
	}
void M1() {
	System.out.println("default Method:M1");
}
void M2() {
	System.out.println("default Method:M2");
}
}
