package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class TestNGSample1 {
  @Test
  public void f() {
	  System.out.println("This is test1 method");
  }
  
  @Test
  public void m()
  {
	  
  System.out.println("This is test2 method");
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("This is before method");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("This is after method");
  }

}
