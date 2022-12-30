package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test1 extends SupportingAnnotations{
	@Test(groups = "smoke")
	public void userReg() {
		Reporter.log("user registered",true);
	}
	@Test(groups = "ft")
	public void userLogin() {
		Reporter.log("user login",true);
	}
	@Test(groups = "reg")
	public void userDelete() {
		Reporter.log("user deleted",true);
	}
	@Test(groups = "smoke")
	public void custReg() {
		Reporter.log("cust registered",true);
	}
	@Test(groups = "ft")
	public void custLogin() {
		Reporter.log("cust login",true);
	}
	@Test(groups = "reg")
	public void custDelete() {
		Reporter.log("cust deleted",true);
	}
}