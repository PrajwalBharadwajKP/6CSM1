package TestNG;

import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider_String {
	@DataProvider
	public String[] number() {
		String[] s= {"1", "true", "a", "false", "hello"};
		return s;
	}
	@Test(dataProvider = "number")
	public void m1(String num) {
		Reporter.log("user "+num+" registered",true);
	}

}
