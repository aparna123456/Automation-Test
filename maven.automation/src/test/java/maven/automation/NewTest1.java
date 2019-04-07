package maven.automation;

import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.AfterTest;

public class NewTest1 {
 
	  @Test
	  
	  public void f() {

		  System.out.println("I am from Test class");
	  }
	  @BeforeMethod
	  public void beforeMethod() {
	  System.out.println("I am from before methos");
	  }

	  @AfterMethod
	  public void afterMethod() {
		  System.out.println("I am from after method");
	  }

	  @BeforeClass
	  public void beforeClass() {
		  System.out.println("I am from before class");
	  }

	  @AfterClass
	  public void afterClass() {
		  System.out.println("I am from after class");
	  }

	//  @Parameters({"browser"})
	  @BeforeTest
	  public void beforeTest() {
		  System.out.println("I am from before test");
	  }

	  @AfterTest
	  public void afterTest() {
		  System.out.println("I am from after test");
	  }

	  @BeforeSuite
	  public void beforeSuite() {
		  System.out.println("I am from before suite");
	  }

}
