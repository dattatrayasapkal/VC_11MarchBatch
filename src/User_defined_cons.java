public class User_defined_cons 
{
 int per;	// default value stored in int type variable per=0;
 String Name="Datta";	// default value stored in String type variable Name=null;
 int rollno=9096;

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



User_defined_cons o1 = new User_defined_cons();		// constructor with zero i/p parameter/argument is called here.

User_defined_cons o2 = new User_defined_cons();		// constructor with zero i/p parameter/argument is called here.

User_defined_cons o3 = new User_defined_cons("Avinash Konade");		// constructor with one String i/p parameter/argument is called here & o5 is assigned by the constr.
User_defined_cons o4 = new User_defined_cons("Nagesh Konade");		// constructor with one String i/p parameter/argument is called here & o6 is assigned by the constr.

User_defined_cons o5 = new User_defined_cons(83,86,75);		// constructor with three int i/p parameter/argument is called here & o7 is assigned by the constr.
User_defined_cons o6 = new User_defined_cons(93,80,87);		// constructor with three int i/p parameter/argument is called here & o7 is assigned by the constr.

System.out.println(o3.Name);	// in o5 object Name variable stored value is printed here.
System.out.println(o4.Name);	// in o6 object Name variable stored value is printed here.
System.out.println(o5.per);	// in o7 object per variable stored value is printed here.
System.out.println(o6.per);	// in o8 object per variable stored value is printed here.
o1.per=10;
o1.Name="Datta";
o1.rollno=9096;


}

}
