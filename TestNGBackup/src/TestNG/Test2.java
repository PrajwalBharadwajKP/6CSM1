package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test2 extends SupportingAnnotations{
  @Test
  public void test2() {
	  Reporter.log("Test2",true);
  }
}