import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assert_example {

	@Test
	public void M1() {
		System.out.println("i am from method 1");
		//Assert.assertTrue(false);
		SoftAssert obj = new SoftAssert();
		obj.assertTrue(false);  //verification do
		System.out.println("i am after assert");
		obj.assertAll();
	}
	
	@Test (priority=0)
	public void M2() {
		System.out.println("i am from method 2");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
