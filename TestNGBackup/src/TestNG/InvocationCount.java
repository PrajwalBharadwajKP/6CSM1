package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class InvocationCount {
	
	@Test(invocationCount = 10)
	public void userRegister() {
		Reporter.log("user registered successfully",true);
	}
}