package LoopStatment;

public class Leapyear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Condition for leap yr
		//yr should be divisible by 400 and 4 but not by 100
		M1(2004);
	}
//public static void M1(int year ) {
//	if(((year%4==0)&& (year%100 !=0)) || (year %400==0)) {
//		System.out.println("Specified Year is Leap year");
//	}else {
//		System.out.println("Specified year is notleap year");
//	}
//}
public static void M1(int year) {
	if(((year %4==0)&&(year%100 !=0))||(year%400 ==0)) {
		System.out.println("leap year");
	}else {
		System.out.println("not leap year");
	}
}
}
