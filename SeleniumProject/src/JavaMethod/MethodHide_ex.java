package JavaMethod;

public class MethodHide_ex extends Hide_method {

public void M1()   {
	
			System.out.println("its methodM1");
	}
	
public static void M2()   {
	System.out.println("it is M2 method ");
	
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Hide_method obj = new MethodHide_ex ();
			obj.M1();
			obj.M2();
	}

}
