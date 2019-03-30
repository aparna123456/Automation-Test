package JavaMethod;

public class OverideMethod extends Addition {

	
	//overload example
	
	public void Add (int i) {
		
	}
	
	// return type shoud be same or subtype of class. covarient termnology.
	public void add(int i, int j) {
	System.out.println("i am in child");	//
		}
	
	public static void main(String[] args) {
		OverideMethod obj= new OverideMethod ();
		obj.add(7, 6);
		
	//	OverideMethod obj1= new OverideMethod();
		
		Addition obj2= new Addition();
		obj2.add(2, 3);
		
		Addition obj3 = new OverideMethod();
		obj3.add(2, 3);
		//OverideMethod obj4 = new Addition ();
	
		
	}

}
