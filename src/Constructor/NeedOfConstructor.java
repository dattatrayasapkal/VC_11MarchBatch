package Constructor;


public class NeedOfConstructor {
public NeedOfConstructor() {
	System.out.println("hello");
}
String name; /// non static //null
int RollNo;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NeedOfConstructor S1 = new NeedOfConstructor();
		NeedOfConstructor S2 =  new NeedOfConstructor();
S1.M1();
	}
public void M1() {
	System.out.println(name+" "+RollNo);
}
}
