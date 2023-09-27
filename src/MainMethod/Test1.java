package MainMethod;

public class Test1 {

	public static void main(String[] args) {// main method not found in class
		System.out.println("Hello");
		// TODO Auto-generated method stub
//public - Acess modifier - to call by JVM from anywhere
		///main method should be public
		
//Static Main Method is class level method  and it is not related to object
		Test1  T1= new Test1();
		//void - Does not have return type
		//Main -method name (This is the name which is configured in jVM)
		//String []args = String array/command line Argument
		
		}
public static void Main(String[]args) {
	System.out.println("Hello");
}
}
