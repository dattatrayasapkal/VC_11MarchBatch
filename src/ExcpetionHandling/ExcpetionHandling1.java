package ExcpetionHandling;

public class ExcpetionHandling1 {
	public static void main(String[] args)  {

//      Type  of exception
//   1.Checked exception
//   2.Uncheckexception-JVM
	// 1.Arithemeticexception
	// 2.NullpointException
	// 3.Arrayoutboundexception
	// 4.Numberformatexception
		System.out.println("hi good evening");
		
		int Number=100;
	//System.out.println(Number/0);// java.lang.ArithmeticException
		
		System.out.println("hi good evening");
      String str = "Rohit";
    //  Integer.parseInt(str);//java.lang.NumberFormatException
      
      String test= null;
  //    System.out.println(test.length()); //java.lang.NullPointerException
     // int arr[]= new int[-5];//java.lang.NegativeArraySizeException
      int arr[]= new int[5];
      arr[0]=33;
      arr[6]=44;//java.lang.ArrayIndexOutOfBoundsException
      
      // Exception handling -> It is Mechanism to handle runtime Exception
      
}
}