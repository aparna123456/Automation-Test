package JavaMethod;

public class ABCConstructor {

	int a;

	public ABCConstructor() {
		 a=15;
	}
	//default constuctor
	
	public ABCConstructor(int c) {
			
		a=c;
		System.out.println("i am in constructor");
		
	}
		
	public ABCConstructor(int c,int v) {
			
		a=v;
		System.out.println("i am in constructor");
	
	}

public static void main(String [] args) {

 ABCConstructor obj= new ABCConstructor(5);	
 System.out.println(obj.a);
 ABCConstructor obj1=new ABCConstructor(5, 10);
 System.out.println(obj1.a);

}

//purpose of constructor is to create the instance of class & allocate the memory & initalied the variable
}