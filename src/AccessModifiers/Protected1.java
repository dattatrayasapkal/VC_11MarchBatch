package AccessModifiers;

public class Protected1 {

	public static void main(String[] args) {
		
		Protected1 pd = new Protected1();
		pd.M3();
		pd.M4();
	}
protected void M4() {
	System.out.println("protected method:M4");
}
protected void M3() {
	System.out.println("protected method:M3");
}
}
