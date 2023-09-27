package Methods;

public class Operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	topic---> ArithmeticOperator
int a = 100;
int b = 45;
System.out.println(a+b);
System.out.println(a-b);
System.out.println(a/b);
System.out.println(a*b);
System.out.println(a%b);
System.out.println("*******************************************");
	
int x = 10;
int y =20;
int z;
z=x;///Assign operator
System.out.println(z);
x++; ////increment type
System.out.println(x);
x= x+2;
System.out.println(x);
x--;
System.out.println(x);
x=x-1;
System.out.println(x);
System.out.println("************************************");

//Topic Logical Operator
boolean A=true;
boolean B = false;
System.out.println(A&&B);
System.out.println(A|| B);
System.out.println("**************************************");

//Topic---->Relationopertor
int A1 = 10;
int B1 = 15;
System.out.println(A1<B1);
System.out.println(A1>B1);
System.out.println(A1<=B1);
System.out.println(A1>=B1);
System.out.println(A1!= B1);
System.out.println("************************************************");
	

// if stament
//syntax
// if(Conditon){
//Statment1; Executed when cond is true}
	M1();
	
	M2(50);
	M2(15);
	M3(2000);
	M3(2003);
	}
	public static void M1() {
		int u = 10;
		int e = 5;
		int p = u+e;
		if(p>=20) {
		System.out.println("greater8");	
		}
		else {
			System.out.println("less than 20");
		}

	}
	public static void M2(int marks) {
		if (marks>=35) {
			System.out.println("Result--->pass");
		}
		else {
			System.out.println("Result---> Failed");
		}
	}
	//
	public static void M3(int year) {
		if(((year %4 ==0 )&&(year % 100 !=0) ) || (year % 400 ==0)) {
			System.out.println("specified year is leap  year");
		}
		else {
			System.out.println("specified year is not  leap  year");
		}
}int a=10;
}
	
	
	



