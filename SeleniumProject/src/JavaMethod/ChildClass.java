package JavaMethod;

public class ChildClass extends ParentClass{
	
	
	//1.  by using static keyword we hide the method. 
	//2. whose class method has to be called its completly depend upon reference & doesnt consider whose class object has been created .
	// eg. parent obj = new child in this refe in of parent and it is pointing to child class obj. as mention above whenever we called 
	// static method it always consider reference not the object, so in above code it will called the staic method of parent class. 
	public static void Method1() {
		System.out.println("i am in child class");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChildClass obj = new ChildClass();
		obj.Method1();
		
		ParentClass obj1 = new ParentClass();
		
		obj1.Method1();
		
		ParentClass obj2 = new ChildClass();
		obj2.Method1();
	}

}
