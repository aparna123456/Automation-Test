package JavaMethod;

public final class ImmutableClass_String {
		
		private final int i;
		private final int j;
		
	public int geti() {
		return i;
		
	}
	
	public int getj() {
		return j;
		
	}
		
	public void seti(int a) { // assignment how to set the value in setter method
	//	i.a;
		
	}
	public ImmutableClass_String (int k, int p) {  // constructor
		i=k;
		j=p;
		
		System.out.println(+k);
		System.out.println(+p);
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ImmutableClass_String obj = new ImmutableClass_String(23,30);
		ImmutableClass_String obj1 = new ImmutableClass_String(40,60);
		
		
		
	}

}
