package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Multiple {
	final int i=8;
	@Test(priority=-5)
	public void userRegister() {
		Reporter.log("userRegister",true);
	}
	@Test(priority=i)
	public void userEdit() {
		Reporter.log("userEdit",true);
	}
	@Test(priority=3)
	public void userDelete() {
		Reporter.log("userDelete",true);
	}
	@Test(priority=-4)
	public void userLogin() {
		Reporter.log("userLogin",true);
	}
}