package ContolsStatement;

public class AllControlStatement {

	public static void main(String[] args) {
		
M1();  // direct Method name
AllControlStatement.M1();
///called by class method name
M2();
AllControlStatement b1 = new AllControlStatement();
b1.M3();  // call by ref class method for non static method
M4();
M5(75); // Static method with parameter
M5(64);
M5(56);
M5(51);
M5(36);
M5(25);
M6(1);
M6(2);
M6(3);
M6(4);
M6(5);



	
	
	}
public static void M1() { // static method
	int a = 10;
	int b = 20;
	int c = a+b;
	if(c>20) {
		System.out.println("c is greater than 20");
	}
	else {
		System.out.println("c is greater than 20");
	}
	System.out.println("programe is completed");
	}
	
	// If else 2nd Example
public static void M2() { // static method
	int Marks = 50;
	// if(conditon ){
//statement1 -->>> Executed when condition is True
// }else{
// statement 2 ----> Excuted when conditon is False	}
	if(Marks >= 35) {
		System.out.println("result--> Pass");
	}else {
		System.out.println("'Result---> Failed");
	}
	
	System.out.println("Programe is Completed");
	
	
}
	/// if else 3rd Example
public void M3() {
String S1 = "Java";
String S2 = "java";
if(S1==S2) {
	System.out.println("S1 and S2 are equal numbers");
}else {
	System.out.println("S1 and S2 are not equal numbers");
}
System.out.println("Programe is Completed");
}

/// if Else 4th Example
// Check Whether a number is Odd or Even

public static void M4() {
int Num1 = 25;/// by visually.its odd number
if(Num1 % 2==0) {
	System.out.println("The Number is Even");
}else {
	System.out.println("The Number is Odd Number");
}
}
//if elseif ladder
/// Syntax --->
/* if(conditon){
 * Statemnet1--->True
 * }else if{
 * statment2---> True
 * }else if(condition){
 * statment3-->True
 * }else{
 * stament4
 * }*/
 public static void M5(int Marks) {
	 if(Marks >= 65) {
		 System.out.println("Distinction");
	 }else if(Marks>= 60) {
		 System.out.println("First class");
	 }else if(Marks>=55) {
		 System.out.println("Higher Second Class");
	 }else if(Marks>= 50) {
		 System.out.println("Second Class");
	 }else if(Marks>=35) {
		 System.out.println("Pass");
	 }else {
		 System.out.println("Failed");
	 }
		 
	 }
 

/// example to find out the by no.
public static void M6(int day){
if(day = 1) {
	System.out.println("Sunday");
}	else if(day =2){
	System.out.println("Monday");
	
}else if(day = 3) {
	System.out.println("Tuesday");
}else if(day = 4) {
	System.out.println("wednesday");
}else if (day = 5) {
	System.out.println("Thuseday");
}else if(day = 6) {
	System.out.println("Friday");
}else if(day = 7) {
	System.out.println("Saturday");
}else {
	System.out.println("invalid day");
}
}
}