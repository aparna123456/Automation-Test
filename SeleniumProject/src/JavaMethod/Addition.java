package JavaMethod;

public class Addition {
//public final class Addition  = if we use this then cannot be extend in child class 
	//overload type example
	// cannot override in child class if u used "final" keyword in method . class, 
	//public final void add(int i, int j){//
	public void add(int i, int j){
	 System.out.println("i am in parent");	
	}
	
	public void add(char i, int j){
		 System.out.println(i+j);	
		}
// return type doesn't play any role so its showing  dupilicate error. its applicable within class.
	
	public static void main(String[] args) {
		
	Addition objadd=new Addition();
	objadd.add(7, 9);
	

	}

}
