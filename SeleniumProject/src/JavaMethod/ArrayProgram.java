package JavaMethod;

public class ArrayProgram {

	public int [][]p;
	public int []q[];
	public int r[][]; //sequre bracket near to value.
	//public [] int s[];
	//public [][] int z;
	static int []k; // if u not initialised then it shows null point exception.
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int []p = {1,2,3,4,5}; // one dimension
		
		//or
		p[0]=5;
		p[1]=2;
		
		//or
		
		int q[][]= {{1,2,3}, {4,5,6},{7,8,9,10},{11,12,13,14,15}}; // multidimensions array
		
		//int []p= new int[5];
			

/*		for(int i=0;i<=p.length; i++)
		{
			
			System.out.println(p[i]); // ararry index out of boundery exception, for selenium no such element found
		}
		//int []p= new int[10];// cannot create new arrary of same name.
		System.out.println(p.length);*/
	//System.out.println(q.length);
	//System.out.println(q[1].length);
	//	System.out.println(q[0].length);
	System.out.println(q[0][0]);
	System.out.println(q[1][1]);
	System.out.println(q[2][2]);
	System.out.println(q[3][3]);
	
	}
	

}
