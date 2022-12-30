package TestNG;

import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider_Object {
	@DataProvider
	public Object[] values() {
		Object[] s= {1, true, 'a', false, "hello"};
		return s;
	}
	@Test(dataProvider = "values")
	public void m1(Object a) {
		Reporter.log("user "+a+" registered",true);
	}
}