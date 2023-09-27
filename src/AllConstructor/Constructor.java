package AllConstructor;

public class Constructor {

	public static void main(String[] args) {
	 	// TODO Auto-generated method stub
		Constructor R1 = new Constructor(12);
		Constructor R2= new Constructor('A');
		Constructor R3= new Constructor("Datta");
		Constructor R4 = new Constructor();
		Constructor R5 = new Constructor(2,3);

	}
public Constructor(int a) {
System.out.println("Rule 1st---> Constructor cannot create inside the method/block/function");	
}
//public void Constructor(char b) --> return type ..void not allowed

public Constructor(char b) {
	System.out.println("Rule 2nd--> Rutrn Type Concept is not Aplicable for constructor even void also");
}
public Constructor(String c) {
	System.out.println("Rule 3rd--> Name of Constructor must be same as class name");
}
private Constructor() { }
public Constructor(int i,int b) {
	System.out.println("Rule 5th ---> Any No.of Constructor can be Declared in Java but Constructor name Should be same as class name but Agrument /Parameter should be Differnt");
}
}
