package JavaMethod;

public class ThisProgram {

	public int a;
	int b;
	int c;
	
	public void main(int a, int b) {
		a=a;
		b=b;
		
		this.a=a;
		this.b=b;
			c=a;	
		//this can be use to differnticate between instance & local variable//
		System.out.println('a');

	}

}
