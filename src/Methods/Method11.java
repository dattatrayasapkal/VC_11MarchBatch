package Methods;

public class Method11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Method11.Studentname("Rohit");
Method11.Studentname("java");
Method11.Studentname("Lalit");
Method11.Studentname("Rahul");
Method11.Studentinfo("java",45);
Method11.Studentinfo("Lalit",506);


	}
public static void Studentname(String Name) {
	System.out.println(Name);

}
public static void Studentinfo(String Name,int No) {
	System.out.println("Student Info--->"+Name+" "+No);
}
}
