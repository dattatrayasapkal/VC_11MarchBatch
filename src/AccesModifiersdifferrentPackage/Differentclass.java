package AccesModifiersdifferrentPackage;

import AccessModifiers.Default1;
import AccessModifiers.Private1;
import AccessModifiers.Public1;

public class Differentclass {

	public static void main(String[] args) {
		
Public1  p1 = new Public1();
p1.Name();
p1.Name2();
System.out.println(p1.No);
Private1 p2 = new Private1();
//p2.Test1();
//p2.Test2();
Default1 d1 = new Default1();
//d1.M1();
//d1.M2();
//System.out.println(d.No);

Differentclass DC = new Differentclass();
DC.M1();


	}

}
