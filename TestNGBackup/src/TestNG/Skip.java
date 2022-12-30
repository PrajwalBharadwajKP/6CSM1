package TestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Skip {
	@Test
	public void reg() {
		Reporter.log("user registered",true);
		Assert.fail();
	}
	@Test(dependsOnMethods = "reg")
	public void login() {
		Reporter.log("user login",true);
	}
}