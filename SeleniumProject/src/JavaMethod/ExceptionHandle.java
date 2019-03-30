package JavaMethod;

public class ExceptionHandle {
	// eg of uncheck

	public static void main(String[] args) {
		
		int i=5;
		int j=0;
		try {
			int k=i/j;
		}
		
	catch(ArithmeticException e){
		System.out.println("i am in catch");
	}

		System.out.println("i am outside catch");
}
}