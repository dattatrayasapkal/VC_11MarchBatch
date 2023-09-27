package AccessModifiers;

public class DifferntClass {

	public static void main(String[] args) {
		
Public1 p1 = new Public1();
p1.Name();
p1.Name2();
System.out.println(p1.No);
//System.out.println(p1.No1); // private accessmodifier cant be access in diff class
Default1 d1 =new Default1();
d1.M1();
d1.M2();
System.out.println(d1.A);
Protected1 pd = new Protected1();
pd.M3();
pd.M4();
System.out.println(pd.TT);

	}
	

}
