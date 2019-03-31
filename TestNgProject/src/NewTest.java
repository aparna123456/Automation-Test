import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTest {
 

	@Test (description="check login function", invocationCount =1, enabled=false, priority =2, groups= {"regression","smoke"})// to varify the functionlity 
    public void f() { 
	  
	  System.out.println("I am in  F method ");
  }
  
  @Test (priority=1, groups= {"smoke"})
  public void f2() { 
	  System.out.println("I am in  F2 method");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("i am in before method");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("i am in after method");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("i am in before class");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("I am in after class");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("i am in before test");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("i am in after test");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("i am in before suite");
  }
  

  @AfterSuite
  public void afterSuite() {
	  System.out.println("i am in after suite ");
  }

}
