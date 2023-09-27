package AccesModifiersdifferrentPackage;

import AccessModifiers.Public1;

public class TestClass extends Protected1{

	public static void main(String[] args) {
		
		Public1 p1 = new Public1();
		p1.Name();
		p1.Name2();
		System.out.println(p1.No);
		Private1 P2 = new Private();
	//	P2.Test1();
		//P2.Test2();
		Default1 d1 = new Default1();
		d1.M1();
		d1.M2();
;
		TestClass pd =new TestClass();
		pd.M3();
		pd.M4();
		System.out.println("Pd.TT");
		
	}

}
