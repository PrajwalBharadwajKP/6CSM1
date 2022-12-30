package TestNG;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;
public class SupportingAnnotations {
  @BeforeMethod(alwaysRun = true)
  public void beforeMethod() {
	  Reporter.log("BeforeMethod",true);
  }
  @AfterMethod(alwaysRun = true)
  public void afterMethod() {
	  Reporter.log("AfterMethod",true);
  }
  @BeforeClass(alwaysRun = true)
  public void beforeClass() {
	  Reporter.log("BeforeClass",true);
  }
  @AfterClass(alwaysRun = true)
  public void afterClass() {
	  Reporter.log("AfterClass",true);
  }
  @BeforeTest(alwaysRun = true)
  public void beforeTest() {
	  Reporter.log("BeforeTest",true);
  }
  @AfterTest(alwaysRun = true)
  public void afterTest() {
	  Reporter.log("AfterTest",true);
  }
  @BeforeSuite(alwaysRun = true)
  public void beforeSuite() {
	  Reporter.log("BeforeSuite",true);
  }
  @AfterSuite(alwaysRun = true)
  public void afterSuite() {
	  Reporter.log("AfterSuite",true);
  }
}