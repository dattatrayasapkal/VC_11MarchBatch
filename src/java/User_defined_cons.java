
package java;
// CONSTRUCTOR OVERLOADING
public class User_defined_cons {
static int per;	// default value stored in int type variable per=0;
static String Name;	// default value stored in String type variable Name=null;
static int rollno;
User_defined_cons() {
System.out.println("hello");
}
User_defined_cons(int i)	{
rollno=i;
}
User_defined_cons( String j)	{
Name = j ;	// assigning 
}
User_defined_cons(int i,int j,int k)	{

per =(i+j+k)/3; 	// percentage = (i+j+k)/300*100

}

public static void main(String[] args) {
System.out.println("Main Method starting Value of rollno -->" + rollno);
System.out.println("Main Method starting Value of Name -->" + Name);
System.out.println("Main Method starting Value of per -->" + per);


User_defined_cons o2 = new User_defined_cons();		// constructor with zero i/p parameter/argument is called here.

User_defined_cons o3 = new User_defined_cons(1);		// constructor with one int i/p parameter/argument is called here & o3 is assigned by the constr.
User_defined_cons o4 = new User_defined_cons(2);		// constructor with one int i/p parameter/argument is called here & o4 is assigned by the constr.

User_defined_cons o5 = new User_defined_cons("Avinash Konade");		// constructor with one String i/p parameter/argument is called here & o5 is assigned by the constr.
User_defined_cons o6 = new User_defined_cons("Nagesh Konade");		// constructor with one String i/p parameter/argument is called here & o6 is assigned by the constr.

User_defined_cons o7 = new User_defined_cons(83,86,75);		// constructor with three int i/p parameter/argument is called here & o7 is assigned by the constr.
User_defined_cons o8 = new User_defined_cons(93,80,87);		// constructor with three int i/p parameter/argument is called here & o7 is assigned by the constr.

//constructor assign values to object & now printing values stored in object.
System.out.println(o3.rollno);	// in o3 object rollno variable stored value is printed here.
System.out.println(o4.rollno);	// in o4 object rollno variable stored value is printed here.	
System.out.println(o5.Name);	// in o5 object Name variable stored value is printed here.
System.out.println(o6.Name);	// in o6 object Name variable stored value is printed here.
System.out.println(o7.per);	// in o7 object per variable stored value is printed here.
System.out.println(o8.per);	// in o8 object per variable stored value is printed here.

System.out.println("Main Method ending Value of rollno -->" + rollno);
System.out.println("Main Method ending Value of Name -->" + Name);
System.out.println("Main Method ending Value of per -->" + per);
}

}
