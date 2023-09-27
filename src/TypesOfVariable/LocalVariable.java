package TypesOfVariable;

public class LocalVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalVariable.M1();
		LocalVariable.M2();
	}
public static void M1() {
	int RollNo = 20;
	String Name ="Akash";
	//int static name1=30-->  we cannot declared static variable inside the main amethod,
	// bodyor any kind of methods of the class.
	System.out.println("RollNo");
	System.out.println("Name");
	//System.out.println(Abc);
}
public static void M2() {
	int Abc = 30;
	System.out.println(Abc);
}

}
