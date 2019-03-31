import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTestNG1 {
  @Test
  public void f() {
	  System.out.println("i m from test");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("i m from before method");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("i m from after method");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("i m from beforeclass");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("i m from afterclass");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("i m from beforetest");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("i m from aftertest");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("i m from before suite");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("i m from after suite");
  }

}
