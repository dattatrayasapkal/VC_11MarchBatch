package Methods;

public class Method13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Method13.M1();// calling by direct methidM1
M1();
add();
Method13.add();
Method14.m2();// callin from differnt class
Method13.M3(45,50);
M5();
Method13.M6(20);
//Method13.M7();
Method13 obj = new Method13();
obj.M7();
	}
public static void M1 () {
	System.out.println("Hello");
}
public static void add() {
	int a = 120;
	int b =200;
	int c = a+b;
	
	System.out.println("Addition of two no --->"+c);
}
public static void M3(int a,int b) {
	int c = a+b;
	System.out.println("Addition of two no:"+c);
}
public static void M5(){
	int age = 20;
	if(age>18) 
		System.out.println("Age greater than 18");
	
}
public static void M6(int age){
	if(age>18) 
		System.out.println("Age greater than 18");
	
}
public void M7() {
	int age = 20;
	if(age>18) 
		System.out.println("Age greater than 18");
}
	}


