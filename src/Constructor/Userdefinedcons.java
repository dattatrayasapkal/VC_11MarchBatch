package Constructor;

public class Userdefinedcons {
// without para const
	// var dec
	int Num1;
	 int Num2; ///non static globle var
//	 public  void Userdefinedcon(){ // with out parameter
//		 // var.initilization
//		 Num1 = 10;
//		 Num2 = 20;
//		 int add =Num1 + Num2;
//		 //use 
//		 System.out.println(add);
//		 
//		 
//	 }
	 public  void Userdefinedcon(int a,int b){ // with out parameter
	 // var.initilization
		 Num1  = a;
	 Num2 = b;
		 int c =Num1 + Num2;
		 System.out.println(c);
 }
public void Additon() {
	int sum = Num1+Num2;
	System.out.println(sum);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Userdefinedcons M1 = new Userdefinedcons();

		}

}
