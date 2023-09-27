package AccessModifiers;

public class Public1 {
public int No = 100;
	public static void main(String[] args) {
		Public1 P1 = new Public1();
		P1.Name();
		P1.Name2();
		System.out.println(P1.No);

	}
public void Name() {
	System.out.println("Public Method");
}
public void Name2() {
	System.out.println("Public Method");
}

}
