package LogicalPrograms;

import java.util.Scanner;

public class Palindromenumnber1 {

	public static void main(String[] args) {

	int Originalnumber,sum,rem;	
	//Example-- 12453;3
	//1221-1221
	System.out.println("Enter an number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		Originalnumber = num;
		//121
		
		//0;121>0--- true
		//121/10---12
		//12>0--true
		//12/10--1
		//1>0--true
		//1/10--0
		//0>0-- false
		for(sum=0;num>0;num=num/10) {
			rem= num%10;
			sum= sum*10+rem;
		}
		//121=121
		if(sum==Originalnumber) {
			System.out.println(Originalnumber+"-->is a palimndromenumber");
		}else {
			System.out.println(Originalnumber+"-->is not a palindromenumber");
			
		
		
		
		}
	}

}
