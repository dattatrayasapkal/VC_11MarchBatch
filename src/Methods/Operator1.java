package Methods;

import java.util.Scanner;

public class Operator1
{
 void Add()
 {
	 System.out.println("Enter 1st No");
		Scanner sc= new Scanner(System.in);
		int a=sc.nextInt();
		System.out.println("Enter 2st No");
		int b=sc.nextInt();
		int c= a+b;
		System.out.println("Addition==>"+c);
		
 }
 void Sub()
 {
	 System.out.println("Enter 1st No");
		Scanner sc= new Scanner(System.in);
		int a=sc.nextInt();
		System.out.println("Enter 2st No");
		int b=sc.nextInt();
		int c= a-b;
		System.out.println("Substration==>"+c);
		
 }
 void Mul()
 {
	 System.out.println("Enter 1st No");
		Scanner sc= new Scanner(System.in);
		int a=sc.nextInt();
		System.out.println("Enter 2st No");
		int b=sc.nextInt();
		int c= a*b;
		System.out.println("Multiplication==>"+c);
		
 }
 void Div()
 {
	 System.out.println("Enter 1st No");
		Scanner sc= new Scanner(System.in);
		int a=sc.nextInt();
		System.out.println("Enter 2st No");
		int b=sc.nextInt();
		int c= a/b;
		System.out.println("Division==>"+c);
		
 }
 void Rem()
 {
	 System.out.println("Enter 1st No");
		Scanner sc= new Scanner(System.in);
		int a=sc.nextInt();
		System.out.println("Enter 2st No");
		int b=sc.nextInt();
		int c= a%b;
		System.out.println("Remainder==>"+c);
		
 }
	public static void main(String[] args)
	{
		System.out.println("1.Addition");
		System.out.println("2.Substration");
		System.out.println("3.Multification");
		System.out.println("4.Division");
		System.out.println("5.Remainder");
		Scanner sc= new Scanner(System.in);
		int ch=sc.nextInt();
		Operator1 ref = new Operator1();
		switch(ch)
		{
		case 1: ref.Add(); break;
		case 2: ref.Sub();break;
		case 3: ref.Mul();break;
		case 4: ref.Div();break;
		case 5: ref.Rem();break;
		default:System.out.println("Invalid Choice");
		}

}
}


class RelationOperator
{
	void Equal()
	 {
		 System.out.println("Enter 1st No");
			Scanner sc= new Scanner(System.in);
			int a=sc.nextInt();
			System.out.println("Enter 2st No");
			int b=sc.nextInt();
			System.out.println(a==b);
			
	 }
	 void NotEqual()
	 {
		 System.out.println("Enter 1st No");
			Scanner sc= new Scanner(System.in);
			int a=sc.nextInt();
			System.out.println("Enter 2st No");
			int b=sc.nextInt();
			System.out.println(a!=b);
			
	 }
	 void Greater()
	 {
		 System.out.println("Enter 1st No");
			Scanner sc= new Scanner(System.in);
			int a=sc.nextInt();
			System.out.println("Enter 2st No");
			int b=sc.nextInt();
			System.out.println(a>b);
			
	 }
	 void Less()
	 {
		 System.out.println("Enter 1st No");
			Scanner sc= new Scanner(System.in);
			int a=sc.nextInt();
			System.out.println("Enter 2st No");
			int b=sc.nextInt();
			System.out.println(a<b);
			
	 }
	 void Greaterthanequal()
	 {
		 System.out.println("Enter 1st No");
			Scanner sc= new Scanner(System.in);
			int a=sc.nextInt();
			System.out.println("Enter 2st No");
			int b=sc.nextInt();
			System.out.println(a>=b);
			
	 }
	 void Lessthanequal()
	 {
		 System.out.println("Enter 1st No");
			Scanner sc= new Scanner(System.in);
			int a=sc.nextInt();
			System.out.println("Enter 2st No");
			int b=sc.nextInt();
			System.out.println(a<=b);
			
	 }
		public static void main(String[] args)
		{
			System.out.println("1.Equal");
			System.out.println("2.Not Equal");
			System.out.println("3.Greater Than");
			System.out.println("4.Less Than");
			System.out.println("5.Greater Than Equal");
			System.out.println("6.Less Than Equal");
			Scanner sc= new Scanner(System.in);
			int ch=sc.nextInt();
			RelationOperator ref = new RelationOperator();
			switch(ch)
			{
			case 1: ref.Equal();break;
			case 2: ref.NotEqual();break;
			case 3: ref.Greater();break;
			case 4: ref.Less();break;
			case 5: ref.Greaterthanequal();break;
			case 6: ref.Lessthanequal();break;
			default:System.out.println("Invalid Choice");
			}

	}
}

class LogicalOperator
{
	void And()
	 {
		 System.out.println("User Name");
			Scanner sc= new Scanner(System.in);
			int a=sc.nextInt();
			System.out.println("Password");
			int b=sc.nextInt();
			{
			if(a==5579 && b==5570)
			{
				System.out.println("It's True");
			}else
			System.out.println("It's False");
			}
	 }
	 void Or()
	 {
		 System.out.println("User Name");
			Scanner sc= new Scanner(System.in);
			int a=sc.nextInt();
			System.out.println("Password");
			int b=sc.nextInt();
			{
			if(a==5579 || b==5579)
			{
				System.out.println("It's False");
			}else
			System.out.println("It's True");
			}
	 }
	 void Invert()
	 {
		 System.out.println("Enter OTP");
			Scanner sc= new Scanner(System.in);
			int a=sc.nextInt();
			{
			if(!(a == 9096))
			{
			System.out.println("It's False");
			}else
			System.out.println("It's True");
			}
	 }
	
		public static void main(String[] args)
		{
			System.out.println("1.And Operator");
			System.out.println("2.Or Operator");
			System.out.println("3.Invert Operator");
			Scanner sc= new Scanner(System.in);
			int ch=sc.nextInt();
			LogicalOperator ref = new LogicalOperator();
			switch(ch)
			{
			case 1: ref.And();break;
			case 2: ref.Or();break;
			case 3: ref.Invert();break;
			default:System.out.println("Invalid Choice");
			}

	}
}
class TernaryOperator
{
	void And()
	 {
			System.out.println("1st Number");
			Scanner sc= new Scanner(System.in);
			int a=sc.nextInt();
			System.out.println("2st Number");
			int b=sc.nextInt();
			System.out.println("3rd Number");
			int c=sc.nextInt();
			int r=(a>b)?(a>c?a:c):(b>c?b:c);
			{
				System.out.println("Maximum===>"+r);
			}
	 }	 
		public static void main(String[] args)
{
			TernaryOperator ref = new TernaryOperator();
			ref.And();
}

}
