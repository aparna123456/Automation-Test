package JavaMethod;

public class JavaInheritance1 extends JavaInheritance {

	public void classA() {
		
	}
	
	public JavaInheritance1(int a) {
		super(a,56);
		System.out.println("I am in single parameter constructor");
	}
	
	public JavaInheritance1(int a, int b) {
		//super(a); //javainheritance(int b)  b=a 5
		//this(a);
		System.out.println("i am in with double paramenter");
		
	}
	
	
	public static void main(String[] args) {
	//JavaInheritance1 obj1 = new JavaInheritance1(5, 10); //a=5, b=10
	
	//JavaInheritance1 obj2 = new JavaInheritance1(2);//
	}

}
