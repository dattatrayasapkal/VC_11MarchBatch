package Array;

public class Array3 {

	public static void main(String[] args) {
		//String str [] = new String[-2];// java.lang.NegativeArraySizeException
String str[] = new String[4];
		str[0]="Rohit";
		str[1]= "!@#$%^";
		str[2] = "Test";
		//str[3] = "1234";
		System.out.println(str[2]);
		for(int j=0;j<str.length;j++) {
			System.out.println(str[j]);
		}
		
	}

}
