package ExcpetionHandling;

public class ExcpetionHandling2 {

	public static void main(String[] args) {

		System.out.println("Automation");
		int Number = 100;
		
	try {
		System.out.println(Number/0);
	}
	catch(ArithmeticException e) {
		System.out.println("Helio");
		System.out.println(e.getMessage());
		e.printStackTrace();
	}
	// The finally block is used to execute the necessary code wheader an exception is handle or not
	finally {
		System.out.println("This is finally block");
	}
	}

}
